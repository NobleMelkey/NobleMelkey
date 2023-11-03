package Data_structure;

import java.util.Scanner;

import java.util.*;

public class postion_example {
	
	 public static int fpcl(String str) {
	        for (int i = 0; i < str.length(); i++) {
	            if (Character.isUpperCase(str.charAt(i))) {
	                return i + 1; 
	            }
	        }
	        return -1; 
	 }
	        
	       public static int fpsl(String str) {
	    	   for (int i=0;i<str.length();i++) {
	    		   if (Character.isLowerCase(str.charAt(i))) {
	    			   return i+1;
	    		   }
	    	   }
	    	   return-1;
	    	   
	       }
	       public static int digit (String str) {
	    	   for (int i=0;i<str.length();i++) {
	    		   if (Character.isDigit(str.charAt(i))) {
	    			   return i+1;
	    		   }
	    	   }
	    	   return -1;
	       }
	       public static int ws (String str) {
	    	   for (int i=0;i<str.length();i++) {
	    		   if (Character.isWhitespace(str.charAt(i))) {
	    			   return i+1;
	    			   
	    		   }
	    	   }
	    	   return -1;
	       }
	       public static int fpsc(String str) {
		        for (int i = 0; i < str.length(); i++) {
		            if (!Character.isLetterOrDigit(str.charAt(i)) && !Character.isWhitespace(str.charAt(i))) {
		                return i + 1;
		            }
		        }
		        return -1; 
		    }
	       public static int fpv(String str) {
	    	   for (int i = 0; i < str.length(); i++) {
	    		   if (isVowel(str.charAt(i))) {
	    			   return i+1;
	    		   }
	    	   }
	    	   return -1;
	       }
	       public static int fpc(String str) {
		        for (int i = 0; i < str.length(); i++) {
		            if (isConsonant(str.charAt(i))) {
		                return i + 1;
		            }
		        }
		        return -1; 
		    }

	       
	    	   
	private static boolean isConsonant(char charAt) {
			// TODO Auto-generated method stub
			return false;
		}

	private static boolean isVowel(char charAt) {
			// TODO Auto-generated method stub
			return false;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enther the string");
		String inputString=s.nextLine();
		s.close();
		
		int capitalLetterPosition = fpcl(inputString);
        int smallLetterPosition = fpsl(inputString);
        int digitPosition = digit(inputString);
        int whitespacePosition = ws(inputString);
        int specialCharacterPosition = fpsc(inputString);
        int vowelPosition = fpv(inputString);
        int consonantPosition = fpc(inputString);
        System.out.println("Position of the first capital letter: " + capitalLetterPosition);
        System.out.println("Position of the first small letter: " + smallLetterPosition);
        System.out.println("Position of the first digit: " + digitPosition);
        System.out.println("Position of the first whitespace: " + whitespacePosition);
        System.out.println("Position of the first special character: " + specialCharacterPosition);
        System.out.println("Position of the first vowel: " + vowelPosition);
        System.out.println("Position of the first consonant: " + consonantPosition);

	}

}
