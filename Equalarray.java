package arraynames;
import java.util.*;
public class Equalarray {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter size of first array : ");
	int size1=s.nextInt();
	System.out.println("Enter size of secont array : ");
	int size2=s.nextInt();
	
	int a[]=new int[size1];
	int b[]=new int[size2];
	
	System.out.println("Enter data in array : ");
	
	for(int i=0;i<size1;i++)
	{
		a[i]=s.nextInt();
	}
	
	System.out.println("Enter data in array : ");
	for(int i=0;i<size2;i++)
	{
		b[i]=s.nextInt();
	}
	
	boolean ans=Arrays.equals(a,b);
	
	System.out.println("Is both arrays are equals : "+ans);
	s.close();
}
}
