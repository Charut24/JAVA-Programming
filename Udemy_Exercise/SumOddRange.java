package Udemy_Exercise;

public class SumOddRange {

    public static boolean isOdd (int number) {
        if (number < 1) {
            return false;
        }
        return number % 2 != 0;
    }

    public static int sumOdd (int start, int end) {
        if (start < 1 || end < 1 || start > end) {
            return -1;
        }
        int sum = 0;
        for (int i = start; i<=end; i++) {
            sum += isOdd(i)? i: 0;
        }
        return sum;
    }
}
class Main_12 {

    public static void main(String[] args) {
        System.out.println(SumOddRange.sumOdd(1, 100));
        System.out.println(SumOddRange.sumOdd(-1, 100));
        System.out.println(SumOddRange.sumOdd(100, 100));
        System.out.println(SumOddRange.sumOdd(13, 13));
        System.out.println(SumOddRange.sumOdd(100, -100));
        System.out.println(SumOddRange.sumOdd(100, 1000));
    }
}