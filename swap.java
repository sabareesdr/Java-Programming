package sdr;
import java.util.*;
public class swap {

			public static void main(String[] args) {
				Scanner obj=new Scanner(System.in);
				int row=obj.nextInt();
				int col=obj.nextInt();
				int arr[][]=new int[row][row];
				for(int i=0;i<row;i++)
				{
					for(int j=0;j<col;j++)
					{
						arr[i][j]=obj.nextInt();
					System.out.print(arr[i][j]+ " ");
					}
						System.out.println(" ");
				}
							for(int i=0;i<row;i++)
							{
								for(int j=0;j<col;j++)
								{
							if(i==0 && j==0)
							{
								System.out.print(arr[1][1]+" ");
							}
							if(i==1 && j==1)
							{
								System.out.print(arr[0][0]+" ");
						}
							else if(i==0 && j==1)
							{
								
								System.out.print(arr[1][0]+" ");
							}
							else if(i==1 && j==0)
							{
								System.out.print(arr[0][1]+" ");
							}
					}
				System.out.println();
				}
				
				
			}

		

	}


