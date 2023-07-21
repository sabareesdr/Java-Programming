package HW;
import java.util.*;
public class test3 
	{
	public static void main(String[]agrs)
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	{
	a[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++)
	{
	if(n%2==0)
	{
	System.out.println("True");
	break;
	}
	else
	{
	System.out.println("False");
	break;
	}
	}
 }
}

