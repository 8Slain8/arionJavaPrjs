package telran.controller;

import telran.data.DayOfWeek;

public class Main {
    public static void main(String[] args) {
        DayOfWeek monday = DayOfWeek.MONDAY;
        DayOfWeek sunday = DayOfWeek.SUNDAY;
        System.out.println(monday);
        System.out.println(sunday.ordinal());

        monday.printHello();
    }
}
