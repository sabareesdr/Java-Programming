package sdr;

import java.util.*;

public class year {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		String str=obj.nextLine();
		char chararray[]=str.toCharArray();
		Arrays.sort(chararray);
		System.out.println(new String(chararray));
	}

}
