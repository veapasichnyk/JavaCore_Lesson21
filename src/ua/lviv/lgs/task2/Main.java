package ua.lviv.lgs.task2;

import java.util.Date;

public class Main {

    public static void main (String[] args) {

        Date date =  new Date();
        System.out.println(date);
        System.out.println(MethodDateTypeConversion.fromDateToLocalDate(date));
        System.out.println(MethodDateTypeConversion.fromDateToLocalTime(date));
        System.out.println(MethodDateTypeConversion.fromDateToLocalDateTime(date));
    }
}
