/*array list example 
*/
package Data_structure;

import java.util.Scanner;
class dynamicarry{
	private static final int initialCapactiy = 16; 
	private int arr[];
	private int size;
	private int capacity;
	
	

public void add(int value) {
	if (size == capacity)
		expandArray();
	arr[size++]=value;
}
 private void expandArray() {
	 System.out.println("elements in the list");
	 capacity*=2;
	 arr=java.util.Arrays.copyOf(arr, capacity);
 }
public void display () {
	for(int i=0;i<size;i++)
		System.out.println(arr[i]+ " ");
}
public void instertAtPos(int pos , int value) {
	if (size==capacity)
		expandArray();
	for (int i=size-1;i>pos;i--)
		arr[i+1]=arr[i];
	arr[pos]=value;
	size++;
}
public void deletAtPos(int pos) {
	for (int i=pos+1;i<size;i++)
		arr[i-1]=arr[1];
	size--;
	
	if(capacity> initialCapactiy && capacity> 3*size)
		shrinkArray();
}
private void shrinkArray() {
	capacity/=2;
	arr=java.util.Arrays.copyOf(arr, capacity);
}
public int length() {
	return size;
}}
public class DynamicArrayDemo {
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		dynamicarry list = new dynamicarry();
		Scanner s=new Scanner(System.in);
		while(true) {
			System.out.println("\n-------list menu-------\n");
			System.out.println("1.inster at end \n");
			System.out.println("2.display in list \n");
			System.out.println("3.inster is specified postion\n");
			System.out.println("4.delete from specified postion\n");
			System.out.println("5.exit\n");
			System.out.println("\n-------------------\n");
			System.out.println("enter your choice:\t");
			int choice=s.nextInt();
			switch(choice) {
			case 1: 
				System.out.println("enter the elements: ");
				int value=s.nextInt();
				list.add(value);
				break;
				
			case 2:
				list.display();
				break;
				
			case 3:
				System.out.println("enter the pos :");
				int pos= s.nextInt();
				if (pos<0) {
					System.out.println("invaid postion ");
					break;
				}
				System.out.println("enter the data:");
				value = s.nextInt();
				list.instertAtPos(pos,value);
				break;
			case 4:
				System.out.println("enter the posytion ");
				pos=s.nextInt();
				if (pos<0) {
					System.out.println("invaild postion ");
					break;
				}
				list.deletAtPos(pos);
				break;
			case 5:
				System.exit(0);
				default: System.out.println("invaild ");
			
				
			
			
				
			
			}
			
			
		}

	}

}
