package HW;

import java.util.*;
public class test1
{
	    public static void main(String[] args) 
	    {
	        Scanner obj=new Scanner(System.in);
	        int n;
	        n=obj.nextInt();
	        String arr[]=new String[n+1];
	        String a="";
	        int i;
	        
	        for(i=0;i<=n;i++)
	        {
	            arr[i]=obj.nextLine();
	        }
	        int ans=0,max=0;
	        for(i=0;i<=n;i++)
	        {
	            int len=arr[i].length();
	            if(len%2==1)
	            {
	                if(len>max)
	                {
	                    max=len;
	                    ans=10;
	                    a=arr[i];
	                }
	            }
	            else 
	            {
	                ans=1;
	            }
	        }
	        if(ans==10)
	        {
	            System.out.print(a);
	        }
	        else 
	        {
	            System.out.println("Better Luck Next Time");
	        }
	    }
	}