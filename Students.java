package arraynames;
import java.util.*;
public class Students {
public static void main(String[] args) {
	int n,i;
	Scanner s= new Scanner(System.in);
	System.out.println("Enter how many names you want to insert : ");
	n=s.nextInt();
	String a[]=new String[n];
	System.out.println("Enter "+n+" Names");
	
	for(i=0;i<n;i++)
	{
		a[i]=s.next();
		
	}
	System.out.println("Entered "+n+" Names");
	
	for (i=0;i<n;i++)
	{
		System.out.println(a[i]);
	}
}
}

