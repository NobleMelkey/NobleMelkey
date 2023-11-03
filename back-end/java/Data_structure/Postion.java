package Data_structure;

import java.util.*;

public class Postion {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String inputString = scanner.nextLine();

	        scanner.close();

	        int capitalLetterPosition = findPositionOfCapitalLetter(inputString);
	        int smallLetterPosition = findPositionOfSmallLetter(inputString);
	        int digitPosition = findPositionOfDigit(inputString);
	        int whitespacePosition = findPositionOfWhitespace(inputString);
	        int specialCharacterPosition = findPositionOfSpecialCharacter(inputString);
	        int vowelPosition = findPositionOfVowel(inputString);
	        int consonantPosition = findPositionOfConsonant(inputString);

	        System.out.println("Position of the first capital letter: " + capitalLetterPosition);
	        System.out.println("Position of the first small letter: " + smallLetterPosition);
	        System.out.println("Position of the first digit: " + digitPosition);
	        System.out.println("Position of the first whitespace: " + whitespacePosition);
	        System.out.println("Position of the first special character: " + specialCharacterPosition);
	        System.out.println("Position of the first vowel: " + vowelPosition);
	        System.out.println("Position of the first consonant: " + consonantPosition);
	    }

	    public static int findPositionOfCapitalLetter(String str) {
	        for (int i = 0; i < str.length(); i++) {
	        	
	            if (Character.isUpperCase(str.charAt(i))) {
	                return i + 1; 
	            }
	        }
	        return -1; // Return -1 if no capital letter is found
	    }

	    public static int findPositionOfSmallLetter(String str) {
	        for (int i = 0; i < str.length(); i++) {
	            if (Character.isLowerCase(str.charAt(i))) {
	                return i + 1;
	            }
	        }
	        return -1; // Return -1 if no small letter is found
	    }

	    public static int findPositionOfDigit(String str) {
	        for (int i = 0; i < str.length(); i++) {
	            if (Character.isDigit(str.charAt(i))) {
	                return i + 1;
	            }
	        }
	        return -1; // Return -1 if no digit is found
	    }

	    public static int findPositionOfWhitespace(String str) {
	        for (int i = 0; i < str.length(); i++) {
	            if (Character.isWhitespace(str.charAt(i))) {
	                return i + 1;
	            }
	        }
	        return -1; // Return -1 if no whitespace is found
	    }

	    public static int findPositionOfSpecialCharacter(String str) {
	        for (int i = 0; i < str.length(); i++) {
	            if (!Character.isLetterOrDigit(str.charAt(i)) && !Character.isWhitespace(str.charAt(i))) {
	                return i + 1;
	            }
	        }
	        return -1; // Return -1 if no special character is found
	    }

	    public static int findPositionOfVowel(String str) {
	        for (int i = 0; i < str.length(); i++) {
	            if (isVowel(str.charAt(i))) {
	                return i + 1;
	            }
	        }
	        return -1; // Return -1 if no vowel is found
	    }

	    public static int findPositionOfConsonant(String str) {
	        for (int i = 0; i < str.length(); i++) {
	            if (isConsonant(str.charAt(i))) {
	                return i + 1;
	            }
	        }
	        return -1; // Return -1 if no consonant is found
	    }

	    public static boolean isVowel(char ch) {
	        ch = Character.toLowerCase(ch);
	        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
	    }

	    public static boolean isConsonant(char ch) {
	        return Character.isLetter(ch) && !isVowel(ch);
	    }

}
