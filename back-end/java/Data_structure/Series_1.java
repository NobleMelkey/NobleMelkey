package Data_structure;

import java.util.*;

public class Series_1 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the limit for the Fibonacci series: ");
        int limit = scanner.nextInt();

        System.out.println("Fibonacci series up to " + limit + ":");
        generateFibonacciSeries(limit);

        System.out.println("\nPrime numbers up to " + limit + ":");
        generatePrimeNumbers(limit);
    }

    public static void generateFibonacciSeries(int limit) {
        int num1 = 0, num2 = 1;

        System.out.print(num1 + " " + num2 + " ");

        for (int i = 2; i < limit; i++) {
            int nextNum = num1 + num2;
            System.out.print(nextNum + " ");
            num1 = num2;
            num2 = nextNum;
        }
    }

    public static void generatePrimeNumbers(int limit) {
        for (int i = 2; i <= limit; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}