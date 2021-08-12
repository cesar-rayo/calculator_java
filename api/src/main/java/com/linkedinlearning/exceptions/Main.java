package com.linkedinlearning.exceptions;

public class Main {
    public static void main(String[] args) {
        String welcome = "Welcome!";
        char[] chars = welcome.toCharArray();

        try {
            if (chars.length < 10) {
                throw (new Exception("My custom message"));
            }
            char lastChar = chars[chars.length - 1];
            System.out.println("Last char: " + lastChar);

            String sub = welcome.substring(10);
            System.out.println("Substring: " + sub);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index error");
            e.printStackTrace();
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Substring error");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Custom exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
