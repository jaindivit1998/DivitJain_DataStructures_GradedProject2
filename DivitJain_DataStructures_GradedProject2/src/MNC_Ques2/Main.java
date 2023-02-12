package MNC_Ques2;

public class Main {

	public static void main(String[] args)
	{
		Transactions tree=new Transactions();
		tree.node= new Node(50);
		tree.node.left= new Node(30);
		tree.node.right=new Node(60);
		tree.node.left.left=new Node(10);
		tree.node.right.left= new Node(55);
		
		tree.processBST(tree.node);
		
		tree.traverse(tree.newHead);
	}

}

