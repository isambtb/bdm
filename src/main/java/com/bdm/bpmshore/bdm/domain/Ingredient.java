package com.bdm.bpmshore.bdm.domain;

public class Ingredient {
    private String code;
    private Quantity quantity;
    private IngredientSubstance ingredientSubstance;

    class IngredientSubstance{
        private Code code;
        private String name;
        private String desc;

    }

    class Code {
        private String code;
        private String codeSystem;
        private Translation translation;


    }

    class Translation {
        private String code;
    }
}
