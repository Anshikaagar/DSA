package july_2;
class count_complete_tree_nodes {
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
	public static void main(String[] args) {
		

	}
	public int count(Node root)
	{
		if (root==null)
		{
			return 0;
		}
		int left = count(root.left);
		int right = count(root.right);
		return left+right+1;
	}

}
