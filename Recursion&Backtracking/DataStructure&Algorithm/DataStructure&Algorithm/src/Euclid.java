import java.util.Scanner;

public class Euclid {

	private static void Euclid(int a, int b) {
		if(a%b==0)
		{
			System.out.println(b);
			
		}
		else
		{
			Euclid(b,a%b);
		}
		
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		Euclid(a,b);
	}

	
}
