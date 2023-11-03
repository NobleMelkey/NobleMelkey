package Data_structure;

public class Full {
	boolean isFullBinaryTree(Node node) {
		//Checking tree emptiness
		if(node==null)
			return true;
		
		//Checking the children
		if(node.leftChild==null&&node.rightChild==null)
			return true;
		
		if((node.leftChild!=null)&&(node.rightChild!=null))
			return (isFullBinaryTree(node.leftChild)&&isFullBinaryTree(node.rightChild));
		
		return false;
	}

}
