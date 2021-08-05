package com.linkedinlearning.reverser;

public class Main {
    public static void main(String[] args){
        StringReverser stringReverser = new StringReverser();
        System.out.println("Reverse of abc: " + stringReverser.reverse("abc"));
        System.out.println("Reverse of automobile: " + stringReverser.reverse("automobile"));

        System.out.println("Reverse of abc: " + stringReverser.reverse2("abc"));
        System.out.println("Reverse of automobile: " + stringReverser.reverse2("automobile"));
    }
}
