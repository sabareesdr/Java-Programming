package sdr;

class dog
{  
	String name;
	String Native;
	String dept;
	
}

public class persional_details {

	public static void main(String[] args) {
		dog sdr=new dog();
		sdr.name=" Sabaree ";
		sdr.Native=" Valparai ";
		sdr.dept=" CSE ";
		
		String details1="my name is"+  sdr.name;
		String details2="my native is"+  sdr.Native;
		String details3="my dept is"+  sdr.dept;
		System.out.println( details1);
		System.out.println( details2);
		System.out.println( details3);
		
		

	}

}
