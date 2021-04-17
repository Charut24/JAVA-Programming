package Udemy_Exercise;

public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0L) {
            System.out.println("Invalid Value");
            return;
        }

        long days = minutes/1440L;
        long years = days/365L;
        long remainingDays = days % 365L;

        System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");
    }
}

class Main_7 {

    public static void main(String[] args) {
        MinutesToYearsDaysCalculator.printYearsAndDays(525600);
        MinutesToYearsDaysCalculator.printYearsAndDays(1051200);
        MinutesToYearsDaysCalculator.printYearsAndDays(561600);
    }
}
