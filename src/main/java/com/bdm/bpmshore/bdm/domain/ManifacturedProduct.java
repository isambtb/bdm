package com.bdm.bpmshore.bdm.domain;

import java.util.ArrayList;

public class ManifacturedProduct {

    private Code code;
    private String name;
    private ArrayList<Ingredient> ingredients;

    public ManifacturedProduct(Code code, String name, ArrayList<Ingredient> ingredients) {
        this.code = code;
        this.name = name;
        this.ingredients = ingredients;
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

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
}
