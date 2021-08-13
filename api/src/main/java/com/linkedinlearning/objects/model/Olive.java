package com.linkedinlearning.objects.model;

// Can not be instantiated (only its child classes)
public abstract class Olive {
    // Replaced by enum class
    //public static final String KALAMATA = "Kalamata";
    //public static final String LIGURIAN = "Ligurian";

    private OliveName name;
    private OliveColor color;
    private int oil;

    public Olive(){}

    public Olive(OliveName name, OliveColor color, int oil){
        this.name = name;
        this.color = color;
        this.oil = oil;
    }

    public OliveName getName() {
        return name;
    }

    public void setName(OliveName name) {
        this.name = name;
    }

    public OliveColor getColor() {
        return color;
    }

    public void setColor(OliveColor color) {
        this.color = color;
    }

    public int getOil() { return oil; }

    public int crush() {
        String msg = name + ", from " + getOrigin() + ": +" + oil + " units";
        System.out.println(msg);
        return oil;
    }

    public void setOil(int oil) {
        this.oil = oil;
    }

    // Each child class must have this method
    public abstract String getOrigin();
}
