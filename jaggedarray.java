package arraynames;

public class jaggedarray {
public static void main(String[] args) {
	int[][] jaggedArray=new int [2][];
	jaggedArray[0]=new int[] {1,2,3};
	jaggedArray[1]=new int[] {5,6};
	
	for(int x[]:jaggedArray) 
	{
		for(int y:x)
		{
			System.out.print(y+" ");
		}
		System.out.println();
	}
}
}
