package Data_structure;

import java.util.*;

public class CircularLinkedList {
	public class Node {
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
		}
	}
	public Node head=null;
	public Node tail=null;
	
	public void add(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			tail=newNode;
			newNode.next=head;
		}
		else
		{
			tail.next=newNode;
			tail=newNode;
			tail.next=head;
			
		}
		
	}
	
	
	public void insertAtBeginning(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            Node current = head;

            // Traverse to the last node
            while (current.next != head) {
                current = current.next;
            }

            newNode.next = head;
            current.next = newNode;
            head = newNode;
        }
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            Node current = head;

            // Traverse to the last node
            while (current.next != head) {
                current = current.next;
            }

            newNode.next = head;
            current.next = newNode;
        }
    }

    public void delete(int data) {
        if (head == null) {
            return;
        }

        Node current = head;
        Node prev = null;

        // Find the node to be deleted
        while (current.data != data) {
            if (current.next == head) {
                // Element not found in the list
                return;
            }

            prev = current;
            current = current.next;
        }

        // Check if the node to be deleted is the head node
        if (current == head) {
            Node lastNode = head;

            // Traverse to the last node
            while (lastNode.next != head) {
                lastNode = lastNode.next;
            }

            head = head.next;
            lastNode.next = head;
        } else {
            prev.next = current.next;
        }
    }


	//display
	public void display()
	{
		Node current =head;
		if(head==null)
		{
			System.out.println("list is emty");
			return;
		}
		else
		{
			System.out.println("Nodes of the circular linked list");
			do {
				System.out.println(""+current.data);
				current=current.next;
			}while(current!=head);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularLinkedList c1=new CircularLinkedList();
		//c1.insertAtEnd(5);
		c1.add(1);
		c1.add(2);
		c1.add(3);
		c1.add(4);
		c1.insertAtBeginning(0);
		c1.insertAtBeginning(-1);
		c1.delete(3);
		c1.display();

	}

}
