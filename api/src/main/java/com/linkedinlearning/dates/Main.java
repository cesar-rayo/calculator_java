package com.linkedinlearning.dates;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        // Get current date (Old API)
        Date d = new Date();
        System.out.println(d);

        // Create a specific date
        GregorianCalendar gc = new GregorianCalendar(2009, 1, 28); // February 28th
        gc.add(GregorianCalendar.DATE, 1); // Add one day
        Date d2 = gc.getTime();
        System.out.println(d2);

        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println(df.format(d2));

        // Java 8 version (new API)
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        LocalDate ld = LocalDate.of(2009,1, 28); // January 28th
        System.out.println(ld);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_DATE;
        System.out.println(dateTimeFormatter.format(ld));

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("M/d/yyyy");
        System.out.println(dtf.format(ld));


    }
}
