package com.nursalim.standard.classes;

import java.util.Calendar;
import java.util.Date;

public class DateApp {
    public static void main(String[] args) {
        Date date = new Date();
        long millisecond = date.getTime();

        System.out.println(date);
        System.out.println(millisecond);

        // Calendar
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());

        calendar.set(Calendar.YEAR, 2025);
        calendar.set(Calendar.MONTH, 2);

    }
}
