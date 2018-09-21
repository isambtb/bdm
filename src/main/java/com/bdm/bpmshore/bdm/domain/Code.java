package com.bdm.bpmshore.bdm.domain;

public class Code {

    private String code;
    private String codeSystem;
    private String displayName;


    public Code(String code, String codeSystem, String displayName) {
        this.code = code;
        this.codeSystem = codeSystem;
        this.displayName = displayName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCodeSystem() {
        return codeSystem;
    }

    public void setCodeSystem(String codeSystem) {
        this.codeSystem = codeSystem;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
}
