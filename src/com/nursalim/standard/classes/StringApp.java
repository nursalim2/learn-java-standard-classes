package com.nursalim.standard.classes;

public class StringApp {
    public static void main(String[] args) {
        String name = "Nursalim Milasrun";
        String nameLowerCase = name.toLowerCase();
        String nameUpperCase = name.toUpperCase();
        int nameLength = name.length();

        System.out.println(name);
        System.out.println(nameLowerCase);
        System.out.println(nameUpperCase);
        System.out.println(nameLength);
        System.out.println(name.startsWith("Nur"));
        System.out.println(name.endsWith("run"));

        String[] nameSplit = name.split(" ");
        System.out.println(nameSplit[0]);
        System.out.println(nameSplit[1]);
    }
}
