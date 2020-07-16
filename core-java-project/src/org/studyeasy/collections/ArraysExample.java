package org.studyeasy.collections;

public class ArraysExample {

	public static void main(String[] args) {
		 
		int x = 10;
		int y = 20;
		int z = 30;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
// Like this, if there are 100 numbers, we have to write 100 lines which is not good.
// So, We use "ARRAYS"
		
		int[] intArray = { 5,6,7,8,9,10 };
		System.out.println("\n" + intArray + "\n"); 
		
// Output is memory location of intArray - [I@70dea4e
// Array is an collection of elements of same data type in adjacent memory location
		
		System.out.println(intArray[0]);
		System.out.println(intArray[1]);
		System.out.println(intArray[2]);
		System.out.println(intArray[3]);
		System.out.println(intArray[4]);
		System.out.println(intArray[5]);
		
		System.out.println("\n"+ "________________________" + "\n");
// Like this, we can print the elements of Array which is index based and starts with "0".
// But, if there are 100 numbers in an Array, we can't write 100 lines to print them.
// So, we use for() loop and for each() loop.
		
		for(int i =0; i<=intArray.length-1; i++) {
			
			System.out.println(intArray[i]);
		}
		
		System.out.println("\n"+ "******* FOR EACH LOOP" + "\n");
		
		for(int numbers:intArray) {
			
			System.out.println(numbers);
		}

		

	}

}
