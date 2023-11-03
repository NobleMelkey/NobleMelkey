package Data_structure;

import java.util.*;

public class Binary_Serch {
	class BSTNode    
	 {
	     BSTNode left, right;
	     int data;
	 
	     /* Constructor */
	     public BSTNode()
	     {
	         left = null;
	         right = null;
	         data = 0;
	     }
	     /* Constructor */
	     public BSTNode(int n)
	     {
	         left = null;
	         right = null;
	         data = n;
	     }         
	 }
	 
	 /* Class BST */
	 class BST
	 {
	     private BSTNode root;
	 
	     /* Constructor */
	     public BST()
	     {
	         root = null;
	     }
	     /* Functions to insert data */
	     public void insert(int data)
	     {
	         root = insert(root, data);
	     }
	     /* Function to insert data recursively */
	     private BSTNode insert(BSTNode node, int data)
	     {
	         if (node == null)
	             node = new BSTNode(data);
	         else
	         {
	             if (data <= node.data)
	                 node.left = insert(node.left, data);
	             else
	                 node.right = insert(node.right, data);
	         }
	         return node;
	     }
	     /* Function to return least value */
	     public int minValue()
	     {
	         return minValue(root);          
	     }
	     /* Function to return least value recursively */
	     private int minValue(BSTNode r)
	     {
	         if (r.left == null)
	             return r.data;
	         return minValue(r.left);        
	     }
	 
	     public void inorder()
	     {
	         inorder(root);
	     }
	     private void inorder(BSTNode r)
	     {
	         if (r != null)
	         {
	             inorder(r.left);
	             System.out.print(r.data +" ");
	             inorder(r.right);
	         }
	     }
	     /* Function for preorder traversal */
	     public void preorder()
	     {
	         preorder(root);
	     }
	     private void preorder(BSTNode r)
	     {
	         if (r != null)
	         {
	             System.out.print(r.data +" ");
	             preorder(r.left);             
	             preorder(r.right);
	         }
	     }
	     /* Function for postorder traversal */
	     public void postorder()
	     {
	         postorder(root);
	     }
	     private void postorder(BSTNode r)
	     {
	         if (r != null)
	         {
	             postorder(r.left);             
	             postorder(r.right);
	             System.out.print(r.data +" ");
	         }
	     }     
	 }
	
	 /* Class MinValueBST */
	 public class MinValueBST
	 {
	     public static void main(String[] args)
	     {                 
	         Scanner scan = new Scanner(System.in);
	         /* Creating object of BST */
	         BST bst = new BST(); 
	         System.out.println("Minimum Value of Binary Search Tree Test\n");          
	         char ch;
	         /*  Accept input  */
	         do    
	         {
	             System.out.println("Enter integer element to insert");
	             bst.insert( scan.nextInt() );                     
	 
	             /*  Display tree  */ 
	             System.out.print("\nPost order : ");
	             bst.postorder();
	             System.out.print("\nPre order : "); 
	             bst.preorder();
	             System.out.print("\nIn order : ");
	             bst.inorder(); 
	 
	             System.out.println("\nDo you want to continue (Type y or n) \n");
	             ch = scan.next().charAt(0);                        
	         } while (ch == 'Y'|| ch == 'y'); 
	 
	         System.out.println("\nMnimum value of the Binary Search Tree is : "+ bst.minValue());              
	     }
	 }


