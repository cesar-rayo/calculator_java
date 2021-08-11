package com.linkedinlearning.loops;

import java.util.Scanner;

public class Main {
    private static String[] months =
            {"January", "February", "March",
                    "April", "May", "June",
                    "July", "August", "September",
                    "October", "November", "December"};

    public static void main(String[] args) {
        //loopMonths();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a month: ");
            String monthName = scanner.nextLine();
            if (monthName.length() == 0) {
                break;
            }
            int monthNumber = getMonthNumber(monthName);
            if (monthNumber == -1) {
                System.out.println("Could not find month");
            } else {
                System.out.println(String.format(
                        "%s is month number %d", monthName, monthNumber + 1));
            }
        }
    }

    private static void loopMonths() {
        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i]);
        }

        for (String monthName : months) {
            System.out.println(monthName);
        }

        int counter = 0;
        while (counter < months.length) {
            System.out.println(months[counter]);
            counter++;
        }

        int counter2 = 0;
        do {
            System.out.println(months[counter2]);
            counter2++;

            if (counter2 == 5) {
                // exit from the loop
                break;
            }
        } while (counter2 < months.length);
    }

    private static int getMonthNumber(String monthName) {
        for (int i = 0; i < months.length; i++) {
            if (months[i].equalsIgnoreCase(monthName)) {
                return i;
            }
        }
        return -1;
    }
}
