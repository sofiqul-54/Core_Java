package com.sofiqul54;

public class ShowCurrentTime {

    public static void main(String[] args) {

        long totalMilliseconds = System.currentTimeMillis();

        long totalseconds = totalMilliseconds / 1000;

        long currentSecond = totalseconds % 60;

        long totalMinutes = totalseconds / 60;

        long currentMinutes = totalMinutes % 60;

        long totalHours = totalMinutes / 60;

        long currentHours = totalMinutes % 24;

        System.out.println("Current time is " + currentHours + ":" + currentMinutes + ":" + currentSecond + "  GMT");
         
        double x = 1.0;
        double y = 5.0;
        double z = --x + (++y);
        System.out.println("z" +z);
    }
}
