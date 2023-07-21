package Nightclass;
import java.util.*;
public class night1 {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		String a=obj.nextLine();
		for(int i=1;i<a.length();i++)
		{
			System.out.print(" ");
		}
		for(int i=1;i<a.length();i++)
		{
			System.out.print ("*");
		}
		for(int i=1;i<a.length();i++)
		{
			System.out.print(" ");
		}
		System.out.println();
		// next line
		
		for(int i=1;i<a.length();i++)
		{
			System.out.print ("*");
		}
		System.out.print(a);
		for(int i=1;i<a.length();i++)
		{
			System.out.print ("*");
		}
		//next line
		System.out.println();
		
		for(int i=1;i<a.length();i++)
		{
			System.out.print(" ");
		}
		for(int i=1;i<a.length();i++)
		{
			System.out.print ("*");
		}
		for(int i=1;i<a.length();i++)
		{
			System.out.print(" ");
		}
	}

}