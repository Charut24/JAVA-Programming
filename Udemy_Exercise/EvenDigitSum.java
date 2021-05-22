package Udemy_Exercise;

public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }

        int digit, sum = 0;
        while (number > 0) {
            digit = number % 10;
            sum += digit % 2 == 0? digit: 0;
            number /= 10;
        }
        return sum;
    }
}

class Main_15 {

    public static void main(String[] args) {
        System.out.println("Sum of even digits in number 123456789 is " + EvenDigitSum.getEvenDigitSum(123456789));
        System.out.println("Sum of even digits in number 252 is " + EvenDigitSum.getEvenDigitSum(252));
        System.out.println("Sum of even digits in number -22 is " + EvenDigitSum.getEvenDigitSum(-22));
        System.out.println("Sum of even digits in number 4 is " + EvenDigitSum.getEvenDigitSum(4));
        System.out.println("Sum of even digits in number 5 is " + EvenDigitSum.getEvenDigitSum(5));
    }
}
