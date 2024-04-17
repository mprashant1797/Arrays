package arraynames;

public class Array {
public static void main(String[] args) 
{
	//1-D Array
	
	int [] a= {11,22,33,44,55};//Its correct
	int[] b= {100,200,300,400,500};
	System.out.println(a);  // it gives address
	System.out.println(a[1]);
	
	//2-D Array
	
	int[] [] c= {{20,30},{70,90}};
	System.out.println(c);  // it gives Address
	System.out.println(c[1][0]);
	
	// 3-D Array
	
	int [] [] [] d= {{{20},{30,40}}};
	System.out.println(d);  // it gives Address
	System.out.println(d[0][0][0]);
	System.out.println(d[0][1][0]);
	System.out.println(d[0][1][1]);
}
}
