package com.nursalim.standard.classes;

import java.util.StringTokenizer;

public class StringTokenizerApp {
    public static void main(String[] args) {
        String fullName = "Nursalim Milasrun Al Losari";

        StringTokenizer tokenizer = new StringTokenizer(fullName, " ");

        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            System.out.println(token);
        }
    }
}
