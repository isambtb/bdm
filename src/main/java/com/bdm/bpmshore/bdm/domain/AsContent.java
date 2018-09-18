package com.bdm.bpmshore.bdm.domain;

public class AsContent {
    private Quantity quantity;
    private ContainerPackagedProduct containerPackagedProduct;


    class ContainerPackagedProduct{
        private String code;
        private String name;
        private NamedEntity namedEntity;
        private FormCode formCode;
        private AsSpecializedKind asSpecializedKind;

    }

    class NamedEntity {
        private String code;
        private String name;
    }

    class FormCode {
        private String code;
        private String codeSystem;
        private String displayName;
        private Translation translation;
    }

    class Translation {
        private String code;
    }

    class AsSpecializedKind{
        private String code;
    }

    class Code {
        private String code;
        private String codeSystem;
        private String displayName;
    }

    class  SubjectOf{
        private Characteristic characteristic;
    }

    class Characteristic{
        private String code;
        private SubjectOf subjectOf;
    }

}
