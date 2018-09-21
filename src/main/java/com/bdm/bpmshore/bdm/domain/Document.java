package com.bdm.bpmshore.bdm.domain;

import org.springframework.data.annotation.Id;


@org.springframework.data.mongodb.core.mapping.Document(collection = "document")
public class Document {

    @Id
    private String id;
    private String title;
    private String languageCode;
    private String effectiveTime;
    private String setId;
    private String versionNumber;
    private Code code;
    //private Author author;
    //private Section section;


    public Document(String id, String title, String languageCode, String effectiveTime, String setId, String versionNumber, Code code) {
        this.id = id;
        this.title = title;
        this.languageCode = languageCode;
        this.effectiveTime = effectiveTime;
        this.setId = setId;
        this.versionNumber = versionNumber;
        this.code = code;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public String getEffectiveTime() {
        return effectiveTime;
    }

    public void setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    public String getSetId() {
        return setId;
    }

    public void setSetId(String setId) {
        this.setId = setId;
    }

    public String getVersionNumber() {
        return versionNumber;
    }

    public void setVersionNumber(String versionNumber) {
        this.versionNumber = versionNumber;
    }

    public Code getCode() {
        return code;
    }

    public void setCode(Code code) {
        this.code = code;
    }
}
