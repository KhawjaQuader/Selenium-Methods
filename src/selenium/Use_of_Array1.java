package selenium;

import java.util.Arrays;

public class Use_of_Array1 {

	public static void main(String[] args) {
	
		int [] a = new int [5];//array is fixed/static
		
		a [0] = 1;//First index a0
		a [1] = 2;
		a [2] = 3;
		a [4] =	5;//Last index a4 is 5-1 formula of length (VVIMP)
		
		//a [2] = j; some of the character represent number
		//ASCII value every character have converted to value at run time
		System.out.println("Array name is: " + a[0]);
		System.out.println("Array name is: " + a[1]);
		System.out.println("Array name is: " + a[2]);
		System.out.println("Array name is: " + a[3]);//a.length is parameter/property in Array and a is Array name
		System.out.println("Array name is: " + a[4]);//a.length is not a method specially in Array but in other place its a method
		
		System.out.println("\nThs length of the Array is: " + a.length);//Java created array id
		System.out.println("\nPrinting array id: " + a);
		System.out.println("\nPrinting hashCode of the Array, represented by data : " + Arrays.hashCode(a));
		System.out.println("\nPrinting the index position of the value from the ref : " + Arrays.binarySearch(a, 3));
		System.out.println("\nThe length of the Array is : " + (a.length-1)); //Formula a [4] = a [5-1] a[a.lenght-1] or a.length-1
		System.out.println("\nThe length of the Array is : " + a[a.length-1]);
	}  //

}
