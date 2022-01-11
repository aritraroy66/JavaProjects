import java.util.Scanner;

public class Josephus {
	private static int josephus(int n, int k) {
		
		if(n==1)
		{
			return 0;
		}
		else 
			return (josephus(n-1,k)+k)%n;
		
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int result=josephus(a,b);
		System.out.println(result);
	}
}
