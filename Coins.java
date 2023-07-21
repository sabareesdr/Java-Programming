package VIyear;
import java.util.*;
public class Coins {

	public static void main(String[] args) {
	Scanner obj=new Scanner(System.in);
	int n=obj.nextInt();
	
	int array[]=new int[n];
	for(int i=0;i<n;i++)
	{
		array[i]=obj.nextInt();
	}
	for(int i=0;i<n;i++)
	{
	System.out.println(array[i]+" ");
	}
	int min=array[0];
	int max=array[0];
	for(int i=0;i<n;i++)
	{
	if(array[i]>max)
	{
		
		max=array[i];
	}
	else if(array[i]<min)
	{
		min=array[i];
	}
	}
	System.out.println("Max value :"+ max);
	System.out.println("Min Value :"+ min);
	
	int gcd=1;
	for(int i=1;i<=max && i<=min;i++ )
	{
		if(max%i==0 && min%i==0)
		{
			gcd=i;
		}
		System.out.println("GCD :"+ gcd);
	}
 }
}
