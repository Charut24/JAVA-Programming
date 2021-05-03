package Udemy_Exercise;

public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }

        int sum = 0, remainder;
        for (int i=1; i<number/2+1; i++) {
            remainder = number % i;
            sum += remainder == 0? i: 0;
        }
        return number == sum;
    }
}

class Main_20
{
    public static void main(String[] args) {
        System.out.println("Is perfect number 6 " + PerfectNumber.isPerfectNumber(6));
        System.out.println("Is perfect number 28 " + PerfectNumber.isPerfectNumber(28));
        System.out.println("Is perfect number 5 " + PerfectNumber.isPerfectNumber(5));
        System.out.println("Is perfect number -1 " + PerfectNumber.isPerfectNumber(-1));
    }
}