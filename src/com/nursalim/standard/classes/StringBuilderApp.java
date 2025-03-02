package com.nursalim.standard.classes;

public class StringBuilderApp {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("Nursalim")
                .append(" ")
                .append("Milasrun");

        System.out.println(builder.toString());
    }
}
