package Data_structure;

import java.util.*;

public class prime_number {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();
        scanner.close();

        System.out.println("First " + N + " prime numbers are:");

        int count = 0;
        int number = 2;

        
        while (count < N) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                count++;
            }
            number++;
        }
    }

    
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) 
        {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}


