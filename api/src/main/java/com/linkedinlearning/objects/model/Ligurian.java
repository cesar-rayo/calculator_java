package com.linkedinlearning.objects.model;

public class Ligurian extends Olive{
    public Ligurian() {
        super(OliveName.LIGURIAN, OliveColor.BLACK, 4);
    }

    @Override
    public String getOrigin() {
        return "Italy";
    }
}
