package Vector;
import java.util.*;
public class TestGenerics {
	public static<E>void printArray(E[] elements)
	{
		for(E element: elements)
		{
			System.out.println(element);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] intArray= {10,20,30,40,50};
		Character[] charArray= {'J','A','V','A','T','R','A','N','I','N','G'};
		System.out.println("printing the integer array");
		printArray(intArray);
		System.out.println("printing the character array");
		printArray(charArray);
		
	}

}
