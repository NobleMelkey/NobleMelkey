package Data_structure;

import java.util.*;

public class Laggest_smaller {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        String[] words = input.split(" ");
        String smallestWord = words[0];
        String largestWord = words[0];

        for (int i = 1; i < words.length; i++) {
            if (words[i].length() < smallestWord.length()) {
                smallestWord = words[i];
            }

            if (words[i].length() > largestWord.length()) {
                largestWord = words[i];
            }
        }

        System.out.println("Smallest word: " + smallestWord);
        System.out.println("Largest word: " + largestWord);
        
    }

}
