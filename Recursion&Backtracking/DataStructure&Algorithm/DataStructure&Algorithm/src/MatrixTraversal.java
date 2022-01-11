import java.util.Scanner;

public class MatrixTraversal {
	
	private static int paths(int n,int r,int c) {
		if(r==n-1|| c==n-1)
			return 1;
		else
			return paths(n,r+1,c)+paths(n,r,c+1);
		
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int n=sc.nextInt();
		int answer=paths(n,0,0);
		System.out.println(answer);
	}

	
}
