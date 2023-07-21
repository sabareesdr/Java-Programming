package sdr;

public class codingmart {

	static void min(int arr[][],int size)
	{
		if(size==0)
			return ;
		int sc[][]=new int[size][3];
		sc[0][0]=arr[0][0];
		sc[0][1]=arr[0][1];
		sc[0][2]=arr[0][2];
		for(int i=1;i<size;i++)
		{
			sc[i][0]=Math.min(sc[i-1][1],sc[i-1][2]) + arr[i][0];
			sc[i][1]=Math.min(sc[i-1][0],sc[i-1][2]) + arr[i][1];
			sc[i][2]=Math.min(sc[i-1][0],sc[i-1][1]) + arr[i][2];
			
		}
		System.out.println("Minimum cost:" +Math.min(sc[size-1][0],Math.min(sc[size-1][1],sc[size-1][2])));

	}
	public static void main(String args[])
	{

		 int arr[][] = { { 17,2,17 }, { 16, 16, 5 }, { 14, 3, 19 } };
		 int size = arr.length; 
		 min(arr, size);
		 
	}

}
