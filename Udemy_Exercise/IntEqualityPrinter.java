package Udemy_Exercise;

public class IntEqualityPrinter {
    public static void printEqual(int firstValue, int secondValue, int thirdValue) {
        if (firstValue < 0 || secondValue < 0 || thirdValue < 0) {
            System.out.println("Invalid Value");
            return;
        }

        String message = "Neither all are equal or different";
        if (firstValue == secondValue && secondValue == thirdValue) {
            message = "All numbers are equal";
        } else if (firstValue != secondValue && secondValue != thirdValue && firstValue != thirdValue) {
            message = "All numbers are different";
        }

        System.out.println(message);
    }
}

class Main_8 {

    public static void main(String[] args) {
        IntEqualityPrinter.printEqual(1, 1, 1);
        IntEqualityPrinter.printEqual(1, 1, 2);
        IntEqualityPrinter.printEqual(-1, -1, -1);
        IntEqualityPrinter.printEqual(1, 2, 3);
        IntEqualityPrinter.printEqual(1, 2, 1);
    }
}