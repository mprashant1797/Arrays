package arraynames;

public class Getname {
public static void main(String[] args) {
	int a[]= new int[3];
	float c[]= new float[3];
	double d[]= new double[3];
	char e[]= new char[3];
	short f[]= new short[3];
	long g[]= new long[3];
	boolean h[]= new boolean[3];
	String b[]= new String[3];
	System.out.println("Integer class name : "+a.getClass().getName());
	System.out.println("Float class name : "+c.getClass().getName());
	System.out.println("Double class name : "+d.getClass().getName());
	System.out.println("Charcter class name : "+e.getClass().getName());
	System.out.println("Short class name : "+f.getClass().getName());
	System.out.println("Long class name : "+g.getClass().getName());
	System.out.println("Boolean class name : "+h.getClass().getName());
	System.out.println("String class name : "+b.getClass().getName());
}
}
