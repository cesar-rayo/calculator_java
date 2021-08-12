package com.linkedinlearning.collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("California");
        list.add("Oregon");
        list.add("Washington");

        System.out.println(list);

        list.add("Alaska");
        System.out.println(list);

        list.remove(0);
        System.out.println(list);

        String state = list.get(1);
        System.out.println("The second state is: " + state);

        int pos = list.indexOf("Alaska");
        System.out.println("Alaska is at position " + pos);


        Map<String, String> map = new HashMap<>();
        map.put("California", "Sacramento");
        map.put("Oregon", "Salem");
        map.put("Washington", "Olympia");
        System.out.println(map);

        map.put("Alaska", "Juneau");
        System.out.println(map);

        String cap = map.get("Oregon");
        System.out.println("The capitol of Oregon is " + cap);

        map.remove("California");
        System.out.println(map);

        // Working with iterators
        System.out.println("Ordered data");
        List<String> list1 = new ArrayList<>();
        list1.add("California");
        list1.add("Oregon");
        list1.add("Washington");

        System.out.println(list1);

        System.out.println(">> Arraylist Iterator");
        Iterator<String> iterator = list1.iterator();
        while (iterator.hasNext()) {
            String value = iterator.next();
            System.out.println(value);
        }

        System.out.println(">> Foreach loop");
        for (String value: list1) {
            System.out.println(value);
        }

        System.out.println(">> Java 8 method");
        list.forEach(System.out::println);

        System.out.println("Unordered data");
        Map<String, String> map1 = new HashMap<>();
        map1.put("California", "Sacramento");
        map1.put("Oregon", "Salem");
        map1.put("Washington", "Olympia");

        System.out.println(map1);

        System.out.println(">> Hashmap Iterator");
        Set<String> keys = map1.keySet();
        Iterator<String> iterator1 = keys.iterator();
        while (iterator1.hasNext()) {
            String key = iterator1.next();
            System.out.println("The capitol of " + key + " is " + map1.get(key));
        }

        System.out.println(">> Hashmap ForEach");
        for (String key: map1.keySet()) {
            System.out.println("The capitol of " + key + " is " + map1.get(key));
        }
    }
}
