package Data_structure;
import java.util.*;
class Node{
	int item;
	Node left,right;
	public Node(int key) {
		item=key;
		left=right=null;
	}
}


public class tree_struc {
	Node root;
	tree_struc(){
		root=null;
	}
	void postorder(Node node) {
		if(node==null)
			return;
		
		//traverse left
		postorder(node.left);
		//traverse right
		postorder(node.right);
		//traverse root
		System.out.print(node.item+"->");
	}
	void inorder(Node node) {
		if(node==null)
			return;
		
		//traverse left
		inorder(node.left);
		//traverse root
		System.out.print(node.item+"->");
		//traverse right
		inorder(node.right);
		
	}
	void preorder(Node node) {
		if(node==null)
			return;
		
		//traverse root
	    System.out.print(node.item+"->");
		//traverse left
	    preorder(node.left);
		//traverse right
		preorder(node.right);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tree_struc tree=new tree_struc();
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(5);
		tree.root.right.left=new Node(6);
		
		System.out.println("Inorder traversal");
		tree.inorder(tree.root);
		System.out.println("\npreorder traversal");
		tree.preorder(tree.root);
		System.out.println("\npostorder traversal");
		tree.postorder(tree.root);

	}

}
