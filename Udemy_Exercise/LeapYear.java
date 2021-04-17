package Udemy_Exercise;

public class LeapYear {

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }

        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}
class Main_2 {

    public static void main(String[] args) {
        boolean isLeapYear = LeapYear.isLeapYear(-1_600);
        System.out.println(isLeapYear);

        isLeapYear = LeapYear.isLeapYear(10_000);
        System.out.println(isLeapYear);

        isLeapYear = LeapYear.isLeapYear(1_600);
        System.out.println(isLeapYear);

        isLeapYear = LeapYear.isLeapYear(1_924);
        System.out.println(isLeapYear);

        isLeapYear = LeapYear.isLeapYear(2_200);
        System.out.println(isLeapYear);

        isLeapYear = LeapYear.isLeapYear(2_000);
        System.out.println(isLeapYear);

        isLeapYear = LeapYear.isLeapYear(2_400);
        System.out.println(isLeapYear);
    }
}