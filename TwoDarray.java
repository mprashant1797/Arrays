package arraynames;

import java.util.Scanner;

public class TwoDarray {
	
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		int a,b,c,d;
		System.out.println("Enter Rows : ");
		a=s.nextInt();
		System.out.println("Enter Collomes : ");
		b=s.nextInt();;
		int[] []r=new int[a][b];
		
		System.out.println("Enter array elements : ");
		
		for(c=0; c<a;c++)
		{
			for(d=0; d<b;d++)
			{
			  r[c][d]=s.nextInt();
			}
		}
		System.out.println("Entered the Matrix : ");
			for(int x[]:r) 
			{
				for(int y:x) 
				{
					System.out.print(y+" ");
			}
				System.out.println();
			}
			
		}
	}


