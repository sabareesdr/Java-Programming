package sdr;
import java.util.*;

public class pattern2 {
	public static void main (String args[])
    {
        Scanner obj= new Scanner (System.in);
        int n=obj.nextInt();
        int b=obj.nextInt();

        for (int i = n; i > 0; i--) 
{ 
    for (int j = b; j > i; j--) 
        System.out.print(j); 
 
    for (int j = i; j > 0; j--) 
        System.out.print(i); 
 
    System.out.println(); 
}

         
    }
}

