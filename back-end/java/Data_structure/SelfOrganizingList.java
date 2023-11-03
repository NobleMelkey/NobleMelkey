package Data_structure;

import java.util.Scanner;

import java.util.ArrayList;

import java.util.Collections;


class selforgnizinglist{
	private ArrayList<Integer>list=new ArrayList<Integer>();
	public void add(int ele)
    {
        int pos = list.size();
        list.add(ele);                    
        while (pos > 0 && ele < list.get(pos - 1))
        {
            list.set(pos, list.get(pos - 1));
            pos--;
        }
        list.set(pos, ele);        
    }
	public void remove(int i) {
		// TODO Auto-generated method stub
		list.remove(i);
		
	}
	public double Search(int ele) {
		// TODO Auto-generated method stub
		return Collections.binarySearch(list, ele);	
	}
	public boolean empty(int nextInt) {
		// TODO Auto-generated method stub
		return list==null || list.size()==0;
	}
	public boolean full(int nextInt) {
		// TODO Auto-generated method stub
		 return false;
		
		
	}
	public void size(int nextInt) {
		// TODO Auto-generated method stub
		 list.size();
		
	}
	public void display()
	{
		System.out.println(list);
	}
	
}

public class SelfOrganizingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		selforgnizinglist list = new selforgnizinglist();
		
		while (true) {
			System.out.println("\n--------SelfOrganizingList--------\n");
			System.out.println("1. insert\n");
			System.out.println("2. delete at position\n");
			System.out.println("3. search\n");
			System.out.println("4. check empty\n");
			System.out.println("5. check full\n");
			System.out.println("6. get size\n");	
			System.out.println("\n-------------over List-------------\n");	
			System.out.println("enthe the choice :");
			int c =s.nextInt();
			switch(c)
			{
			case 1:
				System.out.println("Enter the elements:");
				list.add(s.nextInt());
				break;
			case 2:
				System.out.println("Enter index");
                list.remove(s.nextInt() );                     
                break;
			case 3 :
				System.out.println("enter the element to secerh");
				list.Search(s.nextInt());
				break;
				
			case 4 :
				System.out.println("enter the elements to be check it is empty");
				list.empty(s.nextInt());
				break;
			case 5:
				System.out.println("enter the elements to be check it is full");
				list.full(s.nextInt());
				break;
			case 6:
				System.out.println("get size to the elements ");
				list.size(s.nextInt());
				break;
				default:
					System.out.println("Wrong statement");
					
			
			}
			list.display();
		}
			
		
		

	}

}
