package com.linkedinlearning.objects.model;

public enum OliveName {
    KALAMATA("Kalamata"), LIGURIAN("Ligurian"), LUGANO("Lugano"), GAETA("Gaeta");

    private String name;

    OliveName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
