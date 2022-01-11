package CodePractice;
import java.util.*;
public class AnagramPat {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter String");
	String s1=sc.nextLine();
	String s2=sc.nextLine();
	boolean l=isPresent(s1,s2);
	if(l==true)
	{
		System.out.println("Present");
	}
	else
	{
		System.out.println("Not Present");
	}
}
public static boolean isPresent(String s1,String s2)
{   boolean k=false;
	int count[]=new int[265];
	int m=s2.length();
	int n=s1.length();
	for(int i=0;i<n-m-1;i++)
	{
		k=check(s1,s2,i);
		if(k==true)
		{
		  return true;
		}
	}
		return false;
}
public static boolean check(String s1,String s2,int i)
{
	int count[]=new int[265];
	int m=s2.length();
	int n=s1.length();
	for(int j=0;j<m;j++)
	{
		count[s2.charAt(j)]--;
		count[s1.charAt(i+j)]++;
	}
	for(int k=0;k<265;k++)
	{
		if(count[i]!=0)
			return false;
	}
	return true;
}
}
