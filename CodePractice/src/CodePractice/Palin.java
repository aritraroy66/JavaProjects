package CodePractice;
import java.util.*;
public class Palin {

	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.nextLine();
		int l=s.length();
		StringBuffer st=new StringBuffer(s);
		st.reverse();
		if(s.equals(st.toString()))
		{
			System.out.println("Pallindrome");
			
		}
		else {
			System.out.println("Not Pallindrome");
		}
		int f=0,last=l-1,k=0;
		while(f<l)
		{
			if(s.charAt(f)!=s.charAt(last))
			{
				System.out.println("False");
				k++;
				f++;
				last--;
			}
		}
		if(k==0)
		System.out.println("True");
	}
}
