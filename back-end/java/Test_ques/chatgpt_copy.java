package Test_ques;
import java.util.Scanner;
public class chatgpt_copy {

		

		public class ArrayMutation {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter the number of elements in the array: ");
		        int length = scanner.nextInt();

		        int[] numbers = new int[length];

		        System.out.println("Enter the array elements:");
		        for (int i = 0; i < length; i++) {
		            numbers[i] = scanner.nextInt();
		        }

		        System.out.print("Enter the mutation factor: ");
		        int factor = scanner.nextInt();

		        System.out.println("Original array:");
		        printArray(numbers);

		        mutateArray(numbers, factor);

		        System.out.println("Mutated array:");
		        printArray(numbers);
		    }

		    public static void mutateArray(int[] arr, int factor) {
		        for (int i = 0; i < arr.length; i++) {
		            arr[i] *= factor;
		        }
		    }

		    public static void printArray(int[] arr) {
		        for (int num : arr) {
		            System.out.print(num + " ");
		        }
		        System.out.println();
		    }
		}


	}


