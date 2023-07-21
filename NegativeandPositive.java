package learn;
import java.util.*;
public class NegativeandPositive {

	public static void main(String[] args) {
    Scanner obj=new Scanner(System.in);
    int n=obj.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
    	a[i]=obj.nextInt();	
    }
    for(int i=0;i<n;i++)
    {
    	if(a[i]<0)
    	{
    		System.out.println("Negative:" + a[i]);
    	}
    	else
    	{
    		System.out.println("positive:" + a[i]);
    	}
    }
	}

}
