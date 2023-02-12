package MNC_Ques2;

public class Transactions {

	Node node;
	Node prev=null;
	Node newHead=null;
	void processBST(Node root)
	{
		if(root==null)
			return;
		processBST(root.left);
		Node rightNode=root.right;
		Node leftNode=root.left;
		if(newHead== null)
		{
			newHead=root;
			root.left=null;
			prev=root;
		}
		else
		{
			prev.right=root;
			root.left=null;
			prev=root;
		}
		processBST(rightNode);
	}
	void traverse(Node root)
	{
		if(root==null)
			return;
		System.out.print(root.val+" ");
		traverse(root.right);
	}
}
