package CodePractice;


	import java.util.*;
	public class BinaryTree {
		static Scanner sc=null;
	public static void main(String args[]) {
		sc=new Scanner(System.in);
		Node root=createTree();
		inorder(root);
		System.out.println();
		preorder(root);
		System.out.println();
		postorder(root);
		System.out.println();
		
	}
	private static void postorder(Node root) {
		if(root==null)
			return;
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data+" ");
		
		
	}
	private static void preorder(Node root) {
		if(root==null)
			return;
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
	}
	private static void inorder(Node root) {
		
		if(root==null)
			return;
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	private static Node createTree() {
		
		Node root=null;
		System.out.println("Enter the data");
		int data = sc.nextInt();
		if(data==-1)
		{
			return null;
			
		}
		root=new Node(data);
		System.out.println("Enter left for "+data);
		createTree();
		System.out.println("Enter right for "+data);
		createTree();
		
		return root;
		
	}
	}

