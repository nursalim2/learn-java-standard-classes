package com.nursalim.standard.classes;

import java.util.Arrays;
import java.util.Base64;

public class Base64App {
    public static void main(String[] args) {
        String text = "Nursalim Milasrun Al Losari";

        String encode = Base64.getEncoder().encodeToString(text.getBytes());
        System.out.println(encode);

        String decode = new String(Base64.getDecoder().decode(encode));
        System.out.println(decode);
    }
}
