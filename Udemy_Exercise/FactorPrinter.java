package Udemy_Exercise;

public class FactorPrinter
{
    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
            return;
        }

        StringBuilder factors = new StringBuilder();
        for (int i=1; i<number/2 + 1; i++) {
            int remainder = number % i;
            factors.append(remainder == 0 ? i + "\n": "");
        }
        factors.append(number);
        System.out.println(factors);
    }
}

class Main_19
{
    public static void main (String[] args) {
        FactorPrinter.printFactors(6);
        FactorPrinter.printFactors(32);
        FactorPrinter.printFactors(10);
        FactorPrinter.printFactors(-1);
    }
}
