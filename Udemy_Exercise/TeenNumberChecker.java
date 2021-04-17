package Udemy_Exercise;

public class TeenNumberChecker {

    public static boolean hasTeen (int firstValue, int secondValue, int thirdValue) {
        return isTeen(firstValue) || isTeen(secondValue) || isTeen(thirdValue);
    }

    public static boolean isTeen (int value) {
        return value > 12 && value < 20;
    }
}

class Main_5 {

    public static void main(String[] args) {
        System.out.println(TeenNumberChecker.isTeen(9));
        System.out.println(TeenNumberChecker.isTeen(13));

        System.out.println(TeenNumberChecker.hasTeen(9, 99, 19));
        System.out.println(TeenNumberChecker.hasTeen(23, 15, 42));
        System.out.println(TeenNumberChecker.hasTeen(22, 23, 34));
    }
}