package sdr;
import java.util.*;
class rect
{
	Scanner obj=new Scanner(System.in);
	void display()
	{
		
		int l=obj.nextInt();
		int b=obj.nextInt();
		int Area=l*b;
		System.out.println("Area of rectangle:" +Area);
		
	}
}
class Square extends rect
{
	Scanner obj1=new Scanner(System.in);
	void display1()
	{
		int a=obj1.nextInt();
		int Area1=a*a;
		System.out.println("Area of Square:" +Area1);
	}
	
}
public class SingleInheritance {

	public static void main(String[] args) {
			Square Sc=new Square();
			Sc.display();
			Sc.display1();

	}

}
