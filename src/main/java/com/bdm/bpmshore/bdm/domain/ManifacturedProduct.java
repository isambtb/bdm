package com.bdm.bpmshore.bdm.domain;

import java.util.ArrayList;

public class ManifacturedProduct {

    private Code code;
    private String name;
    //private ArrayList<Ingredient> ingredients;


    public ManifacturedProduct(Code code, String name) {
        this.code = code;
        this.name = name;
    }

    public Code getCode() {
        return code;
    }

    public void setCode(Code code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
