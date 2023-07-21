package Nightclass;
import java.util.*;
class Circle
{
	Scanner obj2=new Scanner(System.in);
	void display2()
	{
		
		int r=obj2.nextInt();
		float p=3.14f;
		float Area2=p*r*r;
		System.out.println("Area of Circle:" +Area2);

}
}
class rect extends Circle
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
class Square extends Circle
{
	Scanner obj1=new Scanner(System.in);
	void display1()
	{
		int a=obj1.nextInt();
		int Area1=a*a;
		System.out.println("Area of Square:" +Area1);
	}
	
}


public class HIerarchical {

	public static void main(String[] args) {
		Square Sc=new Square();
		rect Sc1=new rect();
		Sc.display2();
		Sc1.display2();
		Sc.display1();
		Sc1.display();

	}

}


