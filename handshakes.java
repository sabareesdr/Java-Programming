package VIyear;
import java.util.*;
public class handshakes {

	public static void main(String[] args) {

	    Scanner obj=new Scanner(System.in);
	    int n=obj.nextInt();
	    int count=0;
	    while(n!=0)
	    {
	        count=count+(n-1);
	        n--;
	    }
	    System.out.println(count);

	}

}
