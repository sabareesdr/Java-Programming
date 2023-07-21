package Nightclass;
class box
{
	double width;
	double height;
	double depth;
}
public class mycode{

	public static void main(String[] args) {
		box sdr=new box();
		double vol;
		
		sdr .width=20;
		sdr .height=40;
		sdr .depth=90;
		vol=sdr .width *sdr .height *sdr . depth;
		System.out.println("Volume is:"+vol);
		
	}

}




