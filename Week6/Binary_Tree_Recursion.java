
public class Binary_Tree_Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree bt = new BinaryTree();
		
		bt.insert(6);
	    bt.insert(8);
	    bt.insert(3);
	    bt.insert(5);
	    bt.insert(7);
	    bt.insert(9);
	    
	    //System.out.println(bt.getRootValue());
	    System.out.println(bt.recursive_print());
	}

}

/*
 * Question 2: Add Nodes to a Binary Tree and Print In-Order Recursively
Create a binary tree data structure and write two recursive functions:

Add nodes to the binary tree.
Print the values of nodes in the binary tree in an in-order traversal using a recursive algorithm.
In an in-order traversal, you should print the values of nodes in the following order: left child, 
current node, right child.


*/
