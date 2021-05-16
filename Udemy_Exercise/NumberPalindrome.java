package Udemy_Exercise;

public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int copyNumber = number;
        int digit = 0;
        while (number != 0) {
            digit = number % 10;
            reverse = (reverse * 10) + digit;
            number /= 10;
        }
        return reverse == copyNumber;
    }

}
class Main_13 {

    public static void main(String[] args) {
        System.out.println(NumberPalindrome.isPalindrome(-1221));
        System.out.println(NumberPalindrome.isPalindrome(707));
        System.out.println(NumberPalindrome.isPalindrome(11212));
    }
}
