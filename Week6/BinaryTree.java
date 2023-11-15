import java.util.Stack;
import java.lang.Integer; 


public class BinaryTree {
	Node root;
	int size;
	
	public BinaryTree() {
		root = null;
	}
	
	public BinaryTree(int value) {
		root = new Node(value);
	}
	
	class Node {
		int value;
		Node left, right;

		public Node(int value) {
			this.value = value;
			this.left = null;
			this.right = null;
		}
		
		public int getValue() {
			return this.value;
		}

	}
	
	public Node getRoot() {
		return this.root;
	}
	
	public Integer getRootValue() {
		return this.root.value;
	}
	
	public int getSize() {
		return this.getSize();
	}
	
	public Node insertFirst(int value) {
		Node newNode = new Node(value);
		this.root = newNode;
		return root;
	}
	
	public void insert(int value) {
		Node insertNode = new Node(value);
		if (root == null) {
			root = insertNode;
		} else {
			Node temp = root;
			while (temp != null) {
				if (insertNode.value < temp.value) {
					temp = temp.left;
				} else {
					temp = temp.right;
				}
			}
			temp = insertNode;	
			size++;
		}
	}
	
	public String recursive_print() {
		Stack<Integer> ts = new Stack<Integer>();
		String result = "";
		// set iterating pointer
		if (root == null) {
			result = "empty binary tree";
			return result;
		}
		
		Node temp = root;
		ts.push(temp.value);
		
		while (temp.left != null) {
			temp = temp.left;
			ts.push(temp.value);
			System.out.println(temp.value);
		}
		
		while (!ts.isEmpty()) {
			result += ts.pop();
		}
		return result;

	}
}

/*
 * Node
 * newNode = root
 * current, left, right
 * if < , left, else, right
 * 
 * 
 * start at root, add each left to stack till no more
 * pop
 * 
 * pop
 * check right
 * if can go left, add to stack. If not, check right.
 * if right, add to stack, left...
 * if no right, pop next, check right
 * repeat
 * 
 * 
 * last - pop
 * check left. If no...
 * pop
 * check right. If yes, go right. start again
 * 
 */
