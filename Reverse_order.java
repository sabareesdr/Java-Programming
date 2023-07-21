package Nightclass;
import java.util.*;
public class Reverse_order {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter the number:");
		        int n = sc.nextInt();
		        System.out.println("Reverse number:");
		        int rem,rev=0;
		        int sum=0;
		        while(n!=0)
		        {
		        rem = n%10;
		        rev = rev*10+rem;
		        sum=sum+rem;
		        n/=10;
		        }
		        System.out.println(rev);
		        if(rev%2==0)
		        {
		            System.out.println("even");
		        }
		        else
		        {
		            System.out.println("odd");
		        }
		       System.out.println(sum);

		        
		    }
		    
		}


