package arraynames;

import java.util.Arrays;

public class Sort {
public static void main(String[] args) {
	int a[] = {1,4,5,3,6,5,3,7,9,2,7} ;
	
	for(int b:a) {
		System.out.println(b);
	}
Arrays.sort(a);
System.out.println("New array : ");

for(int b:a) {
	System.out.println(b);
}

}
}
