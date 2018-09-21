package com.bdm.bpmshore.bdm.domain;

public class Subject {

    private ManifacturedProduct manifacturedProduct;

    public Subject(ManifacturedProduct manifacturedProduct) {
        this.manifacturedProduct = manifacturedProduct;
    }

    public ManifacturedProduct getManifacturedProduct() {
        return manifacturedProduct;
    }

    public void setManifacturedProduct(ManifacturedProduct manifacturedProduct) {
        this.manifacturedProduct = manifacturedProduct;
    }
}
