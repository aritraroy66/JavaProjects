package CodePractice;

public class ArrayStack {
	int cap;
    int arr[];
    int top1,top2;
    ArrayStack(int x )
    {
    	arr=new int[x];
    	cap=x;
    	top1=-1;
    	top2=x;
    	
    }
   void push1(int x)
    {
    	if(top1<top2-1)
    	{
    		top1++;
    		arr[top1]=x;
    	}
    	else {
    		System.out.println("Overflow");
    		System.exit(1);
    	}
    } void push2(int x)
    {
    	if(top1<top2-1)
    	{
    		top2--;
    		arr[top2]=x;
    	}
    	else {
    		System.out.println("Overflow");
    		System.exit(1);
    	}
    }
   void pop1()
    {
    	if(top1>-1)
    	{
    		int x=arr[top1];
    		top1--;
    		return x;
    	}
    	else {
    		System.out.println("Stack Underflow");
    		System.ext(1);
    	}
    }
    void pop2()
    {
    	if(top2<cap)
    	{
    		int x=arr[top2];
    		top2++;
    		return x;
    	}
    	else {
    		System.out.println("Stack Underflow");
    		System.ext(1);
    	}
    }
	
	
	
}
