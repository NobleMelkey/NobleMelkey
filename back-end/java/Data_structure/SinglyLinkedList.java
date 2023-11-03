package Data_structure;

public class SinglyLinkedList
{
	class Node{
		int data;
		Node next;
		public Node (int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	public Node head = null;
	public Node tail=null;
	public void addNode(int data) 
	{
		Node newNode = new Node (data);
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
	public void insertAtBeginning(int data)
	{
		Node new_node=new Node(data);
		new_node.next=head;
		head=new_node;
	}
	public void insertAtEnding(int data)
	{
		Node new_node=new Node(data);
		if(head==null)
		{
			head=new_node;
			tail=new_node;
			return;
		}
		tail.next=new_node;
		tail=new_node;
		
		
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
				System.out.println(current.data);
				current=current.next;
			}
			System.out.println("node is completed ");
		}
		
	}
	public void DeleteNode(int data) {
		if(head!=null && head.data==data) {
			head=head.next;
			
		}
		Node prev=null;
		Node current=head;
		while(current!=null && current.data!=data) {
			prev=current;
			current=current.next;
		}
		if(current!=null)
		{
			prev.next=current.next;
			
		}else
		{
			System.out.println("node was not found in the list "+data);
		}
	}
	public static void main(String[] args) 
	{
		SinglyLinkedList s1=new SinglyLinkedList();
		s1.display();
		s1.addNode(10);
		s1.insertAtEnding(20);
		s1.addNode(30);
		s1.addNode(40);
		s1.insertAtBeginning(1000);
		s1.DeleteNode(30);
		s1.insertAtBeginning(2000);
		s1.insertAtEnding(100);
		s1.display();
		
		

	}

}
