package selenium;

import java.util.Arrays;

public class Use_of_Array2 {

	public static void main(String[] args) {
	
		int [] a = new int []{1,2,3,5,4};//Alternate way to write array called literal representation
		
		a [3] = 'j';
		
		System.out.println("Array name is: " + a[0]);
		System.out.println("Array name is: " + a[1]);
		System.out.println("Array name is: " + a[2]);
		System.out.println("Array name is: " + a[3]);//a.length is parameter/property in Array and a is Array name
		System.out.println("Array name is: " + a[4]);//a.length is not a method specially in Array but in other place its a method
		System.out.println("All index value for new Array: " + Arrays.toString(a));//Will print in console [1,2,3,106,4]
		
	}  

}
