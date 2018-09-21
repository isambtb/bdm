package com.bdm.bpmshore.bdm.domain;

public class Section {

    private String RootId;
    private String extension;
    private Subject subject;


    public Section(String rootId, String extension, Subject subject) {
        RootId = rootId;
        this.extension = extension;
        this.subject = subject;
    }



    public String getRootId() {
        return RootId;
    }

    public void setRootId(String rootId) {
        RootId = rootId;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
