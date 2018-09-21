package com.bdm.bpmshore.bdm.domain;



public class Author {

    private String id;
    private String name;
    private String personContactName;




    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Author(String name) {
        this.name = name;
    }


}
