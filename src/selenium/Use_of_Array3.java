package selenium;

import java.util.Arrays;

public class Use_of_Array3 {

	public static void main(String[] args) throws InterruptedException {
	
		int [] a = new int [6];//Declare the size of Array
		
		a [0] = 10;//First index a0
		a [1] = 20;
		a [2] = 30;
		            //gap index count 0 by default
		
		a [5] =	50;//Last index a5 is 6-1 formula of length (VVIMP)
		
		System.out.println("To find the list of array: " + Arrays.toString(a));
		
	    for (int i = 0; i < a.length; i++) {//Using for loop
	    	Thread.sleep(3000);
	    	System.out.println(a[i]);//printing one after another vertically with 3 second break
	    	
	    }
	    int i = 0;
	    while (i < a.length) {//Use of while loop
			System.out.println(a[i]);
			i++;
		}		
	}
}
