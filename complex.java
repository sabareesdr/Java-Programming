package sdr;
import java.util.*;

public class complex {

	public static void main(String[] args) {
		int m1=8;
		int m2=4;
		int n1=6;
		int n2=2;
		int a1,a2,a3,a4;
		a1=m2+n2;
		a2=m2-n2;
		a3=m1*n1-m2*n2;
		a4=m1*n2+m2*n1;
		System.out.print(m1+n1);
		System.out.println("+" +a1 +"i");
		System.out.print(m1-n1);
		System.out.println("+" +a2 +"i");
		System.out.print(a3+"+" +a4 +"i");	

	}

}
