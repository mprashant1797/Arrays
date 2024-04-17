package arraynames;
import java.util.*;
public class Copyarray {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int size;
	System.out.println("Enter how many data you want to enter : ");
	size=s.nextInt();
	int a[]=new int[size];
	System.out.println("Enter data in array : ");
	
	for(int i=0; i<size; i++)
	{
		a[i]=s.nextInt();
	}
	
	int b[]=Arrays.copyOf(a, 5);
	// All 5 numbers copied
	System.out.println("After copying data : ");

	for(int i=0; i<size; i++)
	{
		System.out.println(b[i]);
	}
}
}
