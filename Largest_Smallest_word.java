package sdr;
import java.util.*;
public class Largest_Smallest_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter a Words: ");
        String str = obj.nextLine();
        String[] a = str.split(" ");
        String small= a[0];
        String large= a[0];
        for (int i = 0; i < a.length; i++)
		{
            if (a[i].length() < small.length())
			{
                small = a[i];
            }
            if (a[i].length() > large.length())
			{
                large= a[i];
            }
        }
        System.out.println("Smallest word: " + small);
        System.out.println("Largest word: " + large);

	}
	

}
