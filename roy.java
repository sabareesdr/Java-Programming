package sdr;
import java.util.*;
public class roy {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int L=obj.nextInt();
		int N=obj.nextInt();
		int W=obj.nextInt();
		int H=obj.nextInt();
		int P=W*H;
		if(W<L || H<L)
		{
			System.out.println("UPLOAD ANOTHER");
			
		}
		else if(W==L && H == L)
		{
			System.out.println("ACCEPTED");
		}
		else
		{
			System.out.println("CROP IT");
		}
				

	}

}
