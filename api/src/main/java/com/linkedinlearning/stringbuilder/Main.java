package com.linkedinlearning.stringbuilder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        StringBuilder stringBuilder = new StringBuilder();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value 1: ");
        String input1 = scanner.nextLine();

        System.out.print("Enter value 2: ");
        String input2 = scanner.nextLine();

        stringBuilder.append(input1)
                .append(", ")
                .append(input2);

        System.out.println(stringBuilder.toString());
    }
}
