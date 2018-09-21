package com.bdm.bpmshore.bdm.domain;

import org.springframework.data.annotation.Id;


@org.springframework.data.mongodb.core.mapping.Document(collection = "patient")
public class Document {

    @Id
    private String id;
    private String code;
    private String effectiveTime;
    private String languageCode;
    private String versionNumber;

    private Author author;

    private Section section;

    public Document(String id, String code, String effectiveTime, String languageCode, String versionNumber, Author author, Section section) {
        this.id = id;
        this.code = code;
        this.effectiveTime = effectiveTime;
        this.languageCode = languageCode;
        this.versionNumber = versionNumber;
        this.author = author;
        this.section = section;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getEffectiveTime() {
        return effectiveTime;
    }

    public void setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public String getVersionNumber() {
        return versionNumber;
    }

    public void setVersionNumber(String versionNumber) {
        this.versionNumber = versionNumber;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }
}
