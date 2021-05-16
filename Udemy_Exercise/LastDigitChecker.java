package Udemy_Exercise;

public class LastDigitChecker
{
    public static boolean hasSameLastDigit(int firstValue, int secondValue, int thirdValue) {
        if (!isValid(firstValue) || !isValid(secondValue) || !isValid(thirdValue)) {
            return false;
        }

        int firstValueLastDigit = firstValue % 10;
        int secondValueLastDigit = secondValue % 10;
        int thirdValueLastDigit = thirdValue % 10;
        return firstValueLastDigit == secondValueLastDigit ||
                secondValueLastDigit == thirdValueLastDigit || firstValueLastDigit == thirdValueLastDigit;
    }

    public static boolean isValid(int number) {
        return number > 9 && number < 1001;
    }
}

class Main_17
{
    public static void main(String[] args) {
        System.out.println("Numbers 41, 22 and 71 have same last digits " + LastDigitChecker.hasSameLastDigit(41,22,71));
        System.out.println("Numbers 23, 32 and 42 have same last digits " + LastDigitChecker.hasSameLastDigit(23,32,42));
        System.out.println("Numbers 41, 22 and 71 have same last digits " + LastDigitChecker.hasSameLastDigit(9,99,999));
    }
}