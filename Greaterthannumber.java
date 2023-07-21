package learn;
import java.util.*;
public class Greaterthannumber {

	public static void main(String[] args) 
	{
	Scanner Sc=new Scanner(System.in);
	int n=Sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
	{
		arr[i]=Sc.nextInt();
		System.out.println(arr[i]);
	}
     
	int a=Sc.nextInt();

	for(int i=0;i<n;i++)
	{
		if(a<arr[i])
		{
			System.out.println("greater:" + arr[i]);
		}
	}
	}

}
