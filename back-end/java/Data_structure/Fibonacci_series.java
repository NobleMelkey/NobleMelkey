package Data_structure;

import java.util.Scanner;

public class Fibonacci_series {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the Fibonacci series: ");
        int N = scanner.nextInt();
        scanner.close();

        System.out.println("Fibonacci series of " + N + " elements:");

        
        if (N >= 1) {
            System.out.print("0");
        }
        if (N >= 2) {
            System.out.print(" 1");
        }

        
        int a = 0, b = 1;
        for (int i = 3; i <= N; i++) {
            int next = a + b;
            System.out.print(" " + next);
            a = b;
            b = next;
        }
    }
}
// 0 1 1 2 3 5 8 13