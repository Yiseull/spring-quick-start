package com.springbook.biz.board;

import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlTransient;
import java.util.Date;

// VO(Value Object)
@XmlAccessorType(XmlAccessType.FIELD)   // XML 변환
@Entity
@Table(name = "BOARD")
public class BoardVO {
    @XmlAttribute   // XML 변환
    @Id
    @GeneratedValue
    private int seq;
    private String title;
    private String writer;
    private String content;
    @Temporal(TemporalType.DATE)
    private Date regDate;
    private int cnt;
    @XmlTransient   // XML 변환
    @Transient
    private String searchCondition;
    @XmlTransient   // XML 변환
    @Transient
    private String searchKeyword;
    @XmlTransient   // XML 변환
    @Transient
    private MultipartFile uploadFile;

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public String getSearchCondition() {
        return searchCondition;
    }

    public void setSearchCondition(String searchCondition) {
        this.searchCondition = searchCondition;
    }

    public String getSearchKeyword() {
        return searchKeyword;
    }

    public void setSearchKeyword(String searchKeyword) {
        this.searchKeyword = searchKeyword;
    }

    public MultipartFile getUploadFile() {
        return uploadFile;
    }

    public void setUploadFile(MultipartFile uploadFile) {
        this.uploadFile = uploadFile;
    }

    @Override
    public String toString() {
        return "BoardVO [seq=" + seq +
                ", title='" + title +
                ", writer='" + writer +
                ", content='" + content +
                ", regDate=" + regDate +
                ", cnt=" + cnt +
                ']';
    }
}
