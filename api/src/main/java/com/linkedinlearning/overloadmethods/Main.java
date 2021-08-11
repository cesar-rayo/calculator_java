package com.linkedinlearning.overloadmethods;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String s1 = getInput("Enter value 1: ");
        String s2 = getInput("Enter value 2: ");
        String operation = getInput("Choose an operation (+ - / *): ");

        // double result = addValues(s1, s2);
        // System.out.println("The result is " + result);

        // double result2 = addValues(s1, s2, s1, s2);
        // System.out.println("The result is " + result2);

        double result = 0;
        switch (operation) {
            case "+":
                result = addValues(s1, s2);
                break;
            case "-":
                result = subtractValues(s1, s2);
                break;
            case "/":
                result = divideValues(s1, s2);
                break;
            case "*":
                result = multiplyValues(s1, s2);
                break;
            default:
                System.out.println("Operation not implemented");
                return; // Prevents run the println statement
        }
        System.out.println(String.format("%s %s %s = ", s1, operation, s2) + result);
    }

    private static String getInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextLine();
    }

    private static double addValues(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1 + d2;
    }

    // Accept any number of Strings and then store them in values
    private static double addValues(String... values) {
        double result = 0;
        for (String value: values) {
            double d = Double.parseDouble(value);
            result += d;
        }
        return result;
    }

    private static double subtractValues(String... values) {
        double result = 0;
        for (String value: values) {
            double d = Double.parseDouble(value);
            result -= d;
        }
        return result;
    }

    private static double divideValues(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1 / d2;
    }

    private static double multiplyValues(String... values) {
        double result = 1;
        for (String value: values) {
            double d = Double.parseDouble(value);
            result *= d;
        }
        return result;
    }
}
