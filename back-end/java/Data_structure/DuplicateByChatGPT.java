package Data_structure;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateByChatGPT {
	class Node {
	    int data;
	    Node next;

	    Node(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}

	class LinkedList {
	    Node head;

	    void insert(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	        } else {
	            Node current = head;
	            while (current.next != null) {
	                current = current.next;
	            }
	            current.next = newNode;
	        }
	    }

	    void findDuplicates() {
	        Set<Integer> uniqueElements = new HashSet<>();
	        Node current = head;
	        Node prev = null;

	        while (current != null) {
	            int currentData = current.data;
	            if (uniqueElements.contains(currentData)) {
	                System.out.println("Duplicate element found: " + currentData);
	                // Remove the duplicate node from the linked list
	                prev.next = current.next;
	            } else {
	                uniqueElements.add(currentData);
	                prev = current;
	            }
	            current = current.next;
	        }
	    }
	}
	public class Main {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        LinkedList linkedList = new LinkedList();

	        System.out.print("Enter the number of elements: ");
	        int n = scanner.nextInt();

	        System.out.println("Enter the elements:");
	        for (int i = 0; i < n; i++) {
	            int data = scanner.nextInt();
	            linkedList.insert(data);
	        }

	        System.out.println("Duplicate elements in the linked list:");
	        linkedList.findDuplicates();
	    }
	}

}
