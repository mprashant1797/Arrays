package arraynames;
import java.util.*;
public class Dynamicarray {
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	System.out.println("Enter the size of array : ");
	int n=s.nextInt();
	int a[]=new int[n];
	System.out.println("Enter Array Elements : ");
	
	for(int i=0; i<n;i++)
	{
		a[i]=s.nextInt();
	}
	Arrays.sort(a);
	
	System.out.println("Entered Elements are : ");
	
	for(int i=0; i<n;i++)
	{
		System.out.println(a[i]);
	}
}
}
