package Nightclass;
class area1 
{
	int area;
	area1(int a,int b) 
	{
		area=a*b; // rectangle
	}
	area1(int a)
	{
	    area=a*a; // Square
	}
	area1 (int a,int b,int c) 
	{
		area=(a*b)/c; // triangle
	}
	void display()
	{
		System.out.println(area );
	}
	
}
public class AreaRST {

	public static void main(String[] args)
	{
		area1 rect=new area1(2,4);
		area1 squa=new area1(2);
		area1 tri=new area1(4,3,2);
		
		rect.display();
		squa.display();
		tri.display();
	
	}

}

