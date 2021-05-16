package Udemy_Exercise;

public class LargestPrime {
    public static int getLargestPrime (int number) {
        if (number <= 1) {
            return -1;
        }

        boolean isPrime = false;
        while (!isPrime) {
            isPrime = true;
            for (int i = 2; i < number/2 + 1; i++) {
                if (number % i != 0) {
                    continue;
                }
                number /= i;
                isPrime = false;
                break;
            }
        }

        return number;
    }
}

class Main_23
{
    public static void main(String[] args) {
        System.out.println(LargestPrime.getLargestPrime(21));
        System.out.println(LargestPrime.getLargestPrime(217));
        System.out.println(LargestPrime.getLargestPrime(0));
        System.out.println(LargestPrime.getLargestPrime(45));
        System.out.println(LargestPrime.getLargestPrime(-1));
        System.out.println(LargestPrime.getLargestPrime(16));
    }
}