package sdr;

import java.util.Scanner;

public class two_dimensional {

	public static void main(String[] args) 
	{
	  Scanner obj=new Scanner(System.in);
	  int row=obj.nextInt();
	  int col=obj.nextInt();
    	int arr[][]=new int [row][col];
	  for(int i=0;i<row;i++)
	  {
		  for(int j=0;j<col;j++)
			  arr[i][j]=obj.nextInt();
		  
	  }
	  System.out.println("Original Array");
	  {
	  for(int i=0;i<row;i++,System.out.println())
	  {
		  for(int j=0;j<col;j++)
			  System.out.print(arr[i][j]+ " ");
		  
	  }
	  System.out.println("After Change Array");
	  {
		  
	  for(int i=0;i<col;i++,System.out.println())
	  {
		  for(int j=0;j<row;j++)
			  System.out.print(arr[j][i]+ " ");
		  
	  }

	}}
}
}
	
	
	

