package july_1;
import java.util.*;
public class binary_tree {
	
	class Node{
		int data;
		Node left;
		Node right;
		
		public Node(int data)
		{
			this.data=data;
			this.left=null;
			this.right=null;
			}
		
	}
	private Node root=null;
	
	private static Scanner sc = new Scanner(System.in);
	
	public binary_tree()
	{
		this.root=createtree();
	}
	private Node createtree()
	{
		int data = sc.nextInt();
		
		
	}
	
	public void print()
	{
		print(this.root);
	}

	private void print(Node root2) {
		
		
		
	}

}
