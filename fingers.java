package VIyear;
import java.util.*;
public class fingers {

	public static void main(String[] args) {
		 Scanner obj=new Scanner(System.in);
		    int n=obj.nextInt();
		    if(n%8==1)
		    {
		        System.out.println("Thumb");
		    }
		    if(n==0)
		    {
		    	System.out.println("Nothing");
		    }
		    else if(n%8==2 || n%8==0)
		    {
		        System.out.println("Index Finger");
		    }
		    else if(n%8==3 || n%8==7)
		    {
		        System.out.println("Middle Finger");
		    }
		    else if(n%8==4 || n%8==6)
		    {
		        System.out.println("Ring Finger");
		    }
		    else
		    {
		        System.out.println("Little Finger");
		    }
		  
	}

}
