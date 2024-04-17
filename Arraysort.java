package arraynames;
import java.util.*;
public class Arraysort {
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	int size;
	System.out.println("Enter how many data you want to insert : ");
	size=s.nextInt();
	int a[]=new int[size];
	
	System.out.println("Enter Data in array : ");
	
	for(int i=0;i<size;i++)
	{
		a[i]=s.nextInt();
	}
	Arrays.sort(a);
	System.out.println("Sorted array is : ");
	for(int i=0;i<size;i++)
	{
		System.out.println(a[i]);
	}
}
}
