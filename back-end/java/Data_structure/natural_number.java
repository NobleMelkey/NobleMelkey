package Data_structure;

import java.util.*;

public class natural_number {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();
        scanner.close();

        System.out.println("First " + N + " natural numbers are:");

        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
        }
    }
}


