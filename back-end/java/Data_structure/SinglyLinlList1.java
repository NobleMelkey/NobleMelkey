package Data_structure;

import java.util.Scanner;
import java.util.*;

import Data_structure.SinglyLinkedList.Node;

public class SinglyLinlList1 {
	class Node{
		String Name;
		Node next;
		public Node (String Name)
		{
			this.Name=Name;
			this.next=null;
		}
	}
	public Node head = null;
	public Node tail=null;
	public void addNode(String Name) {
		Node newNode = new Node (Name);
		if(head==null) 
		{
			head=newNode;
			tail=newNode;
			
		}
		else 
		{
			tail.next=newNode;
			tail=newNode;
		}
	}
	public void display()
	{
		Node current = head;
		if(head==null) {
			System.out.println("list is empty ");
			return;
		}
		else
		{
			System.out.println("nodes of singly linked list: ");
			while (current!=null) {
				System.out.println(current.Name);
				current=current.next;
			}
			System.out.println("node is completed ");
		}
	}

	public static void main(String[] args) {
		SinglyLinlList1 s1=new SinglyLinlList1();
		/*s1.display();
		s1.addNode("noble");
		s1.addNode("nithiya");
		s1.addNode("sam");
		s1.addNode("beula");
		s1.display();*/
		int num;
		Scanner s=new Scanner (System.in);
		System.out.print("enter the number of people u need to place:");
		num=s.nextInt();
		int arr[] = new int[num];
	    System.out.println("enter the one by one:");
		
		

	}

}
