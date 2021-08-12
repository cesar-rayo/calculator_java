package com.linkedinlearning.arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Array of primitives");
        int[] ints = {2,5,3,6};
        Arrays.sort(ints);
        for (int value: ints) {
            System.out.println(value);
        }

        String[] strings = {"Red", "Blue", "Green"};
        Arrays.sort(strings);
        for (String value: strings) {
            System.out.println(value);
        }

        System.out.println("Setting an initial size");
        int[] sized = new int[10];
        for (int i = 0; i < sized.length; i++) {
            sized[i] = i * 100;
        }
        for (int value: sized) {
            System.out.println(value);
        }

        System.out.println("Copying an array");
        int[] copied = new int[5];
        // Copy from sized[5] to copied[0], 5 elements
        System.arraycopy(sized, 5, copied, 0, 5);
        for (int value: copied) {
            System.out.println(value);
        }

        System.out.println("Multidimensional Arrays");

        String[][] states = new String[3][2];
        states[0][0] = "California";
        states[0][1] = "Sacramento";
        states[1][0] = "Oregon";
        states[1][1] = "Salem";
        states[2][0] = "Washington";
        states[2][1] = "Olympia";

        for (int i = 0; i < states.length; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append("The capitol of ")
                    .append(states[i][0])
                    .append(" is: ")
                    .append(states[i][1])
                    .append("!");
            System.out.println(sb);
        }
    }
}
