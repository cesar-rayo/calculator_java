package com.linkedinlearning.numbersformating;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Main {
    public static void main(String[] args){
        //double doubleValue = 1234567.89;
        double doubleValue = 1_234_567.89;

        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        System.out.println(numberFormat.format(doubleValue));

        NumberFormat intFormat = NumberFormat.getIntegerInstance();
        System.out.println(intFormat.format(doubleValue));

        numberFormat.setGroupingUsed(false);
        System.out.println(numberFormat.format(doubleValue));

        Locale locale = new Locale("de", "DE");
        NumberFormat localFormat = NumberFormat.getNumberInstance(locale);
        System.out.println(localFormat.format(doubleValue));

        Locale locale2 = new Locale("en", "US");
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale2);
        System.out.println(currencyFormat.format(doubleValue));

        DecimalFormat df = new DecimalFormat("$000.00");
        DecimalFormat df2 = new DecimalFormat("$000.00#");
        //$001.00
        System.out.println(df.format(1));

        //$005.89
        System.out.println(df.format(5.891));

        //$005.891
        System.out.println(df2.format(5.891));

        // Working with switch cases
        int month = 0;

        switch (month) {
            case 0:
                System.out.println("It's january");
                break;
            case 1:
                System.out.println("It's February");
                break;
            case 2:
                System.out.println("It's March");
                break;
            default:
                System.out.println("It's some other month");
        }

        String monthName = "January";

        switch (monthName) {
            case "January":
                System.out.println("It's the first month");
                break;
            default:
                System.out.println("It's some other month");
        }
    }
}
