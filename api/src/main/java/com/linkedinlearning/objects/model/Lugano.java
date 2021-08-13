package com.linkedinlearning.objects.model;

public class Lugano extends Olive{
    public Lugano() {
        super(OliveName.LUGANO, OliveColor.GREEN, 2);
    }

    @Override
    public String getOrigin() {
        return "Spain";
    }
}
