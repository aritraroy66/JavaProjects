package CodePractice;
import java.util.*;
public class Anagram {
public static void main(String args[])
{int k=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter ");
	String s1=sc.nextLine();
    String s2=sc.nextLine();
    char c[]=new char[256];
    for(int i=0;i<s1.length();i++)
    {
    	c[s1.charAt(i)]++;
    }
    for(int i=0;i<s2.length();i++)
    {
    	c[s2.charAt(i)]--;
    }
    for(int i=0;i<256;i++)
    {
    	if(c[i]!=0)
    	{
    		k++;
    	}
    }
    System.out.println(k);
}
}
