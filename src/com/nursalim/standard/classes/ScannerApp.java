package com.nursalim.standard.classes;

import java.util.Scanner;

public class ScannerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nama : ");
        String nama = scanner.nextLine();

        System.out.print("Umur");
        int umur = scanner.nextInt();

        System.out.println("Hello " + nama);
        System.out.println("Umur : " + umur);
    }
}
