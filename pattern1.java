package sdr;
import java.util.*;
public class pattern1 {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int a=obj.nextInt();
		int b=obj.nextInt();
		
	
		
		for(int i=a;i>0;i--)
		{
			for(int j=b;j>i;j--)
			{
				System.out.print(j+" ");
			}
			for(int j=i;j>0;j--)
			{
				System.out.print(i+" ");
			}
			
			System.out.println();
		}
	}

}

