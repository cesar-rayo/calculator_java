package com.linkedinlearning.objects;

import com.linkedinlearning.objects.model.*;

import java.util.ArrayList;
import java.util.List;

/**
 *  This is an <b>olive press<b/> application, and its job is to <i>press olives<i/>!!
 */
public class Main {
    /**
     * The main method
     * @param args - an array of String values
     */
    public static void main(String[] args) {
        List<Olive> olives = new ArrayList<>();
        olives.add(new Kalamata());
        olives.add(new Kalamata());
        olives.add(new Ligurian());
        olives.add(new Gaeta());
        olives.add(new Lugano());

        // Using Press interface
        Press press = new OlivePress();
        press.setOil(5);
        int totalOil = press.getOil(olives);
        System.out.println("Total Oil = " + totalOil + " units of oil");

        // Using interface directly will need to implement methods
        //Press press1 = new Press() {
        //    @Override
        //    public int getOil(List<Olive> olives) { return 0; }
        //    @Override
        //    public void setOil(int oil) { }
        //}
    }
}
