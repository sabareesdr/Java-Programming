package sdr;
import java.util.*;
public class box {
	float height;
	float depth;
	float breath;
	float vol;
	box()
	{
		Scanner obj=new Scanner(System.in);
		height=obj.nextFloat();
		depth=obj.nextFloat();
		breath=obj.nextFloat();
		vol=height*depth*breath;
		System.out.println(vol);
		
	} 
}
class main{
	public static void main(String args[]) {
		box mybox=new box();
	}
}

