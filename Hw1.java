package HW;
class sdr extends Thread
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println(i +" SDRA");
		}
	}
}


public class Hw1 {

	public static void main(String[] args)
		{
			 sdr obj=new sdr();
			 obj.start();

		}


	}

