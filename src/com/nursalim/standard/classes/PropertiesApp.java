package com.nursalim.standard.classes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesApp {
    public static void main(String[] args) {
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("application.properties"));

            System.out.println(properties.getProperty("database.username"));

            properties.put("database.port", 999);
            properties.store(new FileOutputStream("application.properties"), "");

            System.out.println();
        } catch (IOException ex) {
            ex.getMessage();
        }
    }
}
