package sdr;
import java.util.*;
public class string {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		String str=obj.next();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.length()!=0)
				count++;
		}
		System.out.println(count);
	}

}
