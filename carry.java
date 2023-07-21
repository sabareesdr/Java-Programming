package HW;
import java.util.*;
public class carry {

	 public static int numberOfCarries (int num1, int num2) 
		    {
		        int count=0;
		        int a=num1,b=num2;
		        int rem=0;
		        while (a!=0 && b!=0)
		        {
		            int x=a%10,y=b%10;
		            if ((x+y+rem) > 9)
		    	    {
		                count++;
		                int sum=x+y+rem;
		                sum=sum/10;
		                rem=sum;
		            }
		            a=a/10;
		            b=b/10;
		        } 
		        return count;
		    }
		    public static void main (String[]args) 
		    {
		        Scanner obj=new Scanner(System.in);
		        int num1=obj.nextInt();
		        int num2=obj.nextInt();
		    
		        System.out.println(numberOfCarries (num1, num2));
		    } 
		}


