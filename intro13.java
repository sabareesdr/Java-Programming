package sdr;
import java.util.*;
public class intro13 {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		if(0>n)
		{
			System.out.println("Negative"); // -2019
		}
		else if(0<n)
		{
			System.out.println("Positive"); // 2019
		}
		else
		{
			System.out.println("Zero"); //0
		}

	}

}
