import java.util.Arrays;
import java.util.Scanner;

public class SieveOfErastosthenes {

	static void findPrime(int n)
	{
		boolean arr[]=new boolean[n+1];
		Arrays.fill(arr, true);
		arr[0]=false;
		arr[1]=false;
		for(int i=2;i*i<n;i++)
		{
			for(int j=i*2;j<n;j=j+i)
			{
				arr[j]=false;
			}
		}
		for(int i=0;i<n;i++)
		System.out.println(i+" "+arr[i]);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int a=sc.nextInt();
		findPrime(a);
	}
}
