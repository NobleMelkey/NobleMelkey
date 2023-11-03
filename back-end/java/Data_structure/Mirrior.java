package Data_structure;
class Node2
{
	int data;
	Node2 right=null,left=null;
	
	Node2(int data)
	{
		this.data=data;
	}
}


public class Mirrior 
{
	//Function to perform preorder traversal on a given binary tree
	
	public static void preorder(Node2 root)
	{
		if(root == null)
		{
			return;
		}
		
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
	}
	// utility function to swap left subtree with right subtree
	
	public static void swap(Node2 root)
	{
		if(root ==null)
		{
			return;
		}
		Node2 temp=root.left;
		root.left=root.right;
		root.right=temp;
	}
	
	public static void converttomirror(Node2 root)
	{
		//base case: if the tree is empty
		if(root ==null)
		{
			return;
		}
		// convert left subtree
		converttomirror(root.left);
		
		// convert right subtree
		converttomirror(root.right);
		
		//swap left subtree with right subtree
		swap(root);
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node2 root= new Node2(1);
		root.left= new Node2(2);
		root.right=new Node2(3);
		root.left.left=new Node2(4);
		root.left.right=new Node2(5);
		root.right.left=new Node2(6);
		root.right.right=new Node2(7);
		
		converttomirror(root);
		preorder(root);
		
		
		
		

	}

}
