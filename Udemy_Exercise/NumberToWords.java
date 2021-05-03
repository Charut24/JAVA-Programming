package Udemy_Exercise;

public class NumberToWords {
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        StringBuilder word = new StringBuilder();
        int digit;
        int reverseNumber = reverse(number);
        int numberOfZeroes = getDigitCount(number) - getDigitCount(reverseNumber);

        do {
            digit = reverseNumber % 10;
            switch (digit) {
                case 1:
                    word.append("One");
                    break;
                case 2:
                    word.append("Two");
                    break;
                case 3:
                    word.append("Three");
                    break;
                case 4:
                    word.append("Four");
                    break;
                case 5:
                    word.append("Five");
                    break;
                case 6:
                    word.append("Six");
                    break;
                case 7:
                    word.append("Seven");
                    break;
                case 8:
                    word.append("Eight");
                    break;
                case 9:
                    word.append("Nine");
                    break;
                default:
                    word.append("Zero");
            }
            word.append("\n");
            reverseNumber /= 10;
        } while (reverseNumber > 0);

        for (int i=0; i<numberOfZeroes; i++) {
            word.append("Zero\n");
        }
        System.out.println(word);
    }

    public static int reverse(int number) {
        int reverse = 0;
        while (number != 0) {
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }
        return reverse;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }

        int count = 0;
        do {
            count++;
            number /= 10;
        } while(number > 0);
        return count;
    }
}

class Main_21
{
    public static void main(String[] args) {
        System.out.println("Number of digits in value 0: " + NumberToWords.getDigitCount(0));
        System.out.println("Number of digits in value 123: " + NumberToWords.getDigitCount(123));
        System.out.println("Number of digits in value -12: " + NumberToWords.getDigitCount(-12));
        System.out.println("Number of digits in value 5200: " + NumberToWords.getDigitCount(5200));

        System.out.println("Reverse of -321 is: " + NumberToWords.reverse(-321));
        System.out.println("Reverse of 1212 is: " + NumberToWords.reverse(1212));
        System.out.println("Reverse of 1234 is: " + NumberToWords.reverse(1234));
        System.out.println("Reverse of 100 is: " + NumberToWords.reverse(100));

        NumberToWords.numberToWords(123);
        NumberToWords.numberToWords(1010);
        NumberToWords.numberToWords(1000);
        NumberToWords.numberToWords(-12);
        NumberToWords.numberToWords(5);
        NumberToWords.numberToWords(674);
        NumberToWords.numberToWords(0);
    }
}