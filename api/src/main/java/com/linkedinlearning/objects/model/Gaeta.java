package com.linkedinlearning.objects.model;

public class Gaeta extends Olive{
    public Gaeta() {
        super(OliveName.GAETA, OliveColor.GREEN, 4);
    }

    @Override
    public String getOrigin() {
        return "Italy";
    }
}
