package Data_structure;

import java.util.Arrays;

public class Arrays_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {5, 2, 8, 12, 1, 6};
		Arrays.sort(a);
		for(int num:a) {
			System.out.println(num+ " ");
		}
		System.out.println("\n array sorting:");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+"");
		}

	}

}
