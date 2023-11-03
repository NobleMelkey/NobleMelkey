package Try;

import java.util.Scanner;

public class Local_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,flag=0;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number of elements :");
		n=s.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        for (int i=1;i<n;i++)
		{
			if ( a[0]>a[1]&&a[0]>a[n-1])
			{
				flag=a[0];
				break;
			}
			if (a[i]>a[i-1]&&a[i]>a[i+1])
			{
				flag=a[i];
				break;
			}
			 if (a[n-1]>a[n-2]&&a[n-1]>a[0])
			{
				flag=a[n-1];
				break;
			}
		}

	}

}
