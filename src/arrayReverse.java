/**
 * 
 * @author ragavramakrishnan
 * The program is used to reverse an array without creating a new array. 
 * The program finds the middle element and swaps the extremes continiously moving towards
 * the middle element.
 */
public class arrayReverse {
	/**
	 * 
	 * @param a
	 * @return array a
	 * The method takes an array as input, finds the middle and then swaps the extremes
	 */
	public int[] reverseArray(int[] a){
		int length = a.length;
		if(length<=0){
			System.out.println("the array does not contain any element");
		}
		
		if(length==1){
			return a;
		}
		// find the middle. Can also use initialIndex + (finalIndex - InitialIndex)/2;
		int middle = a.length/2;
		// Swap the elements
		for(int i=0;i<middle;i++){
			int temp = a[i];
			a[i] = a[length-1-i];
			a[length-1-i] = temp;
		}
		return a;
	}
	
	// Driver method
	public static void main(String[] args){
		arrayReverse ar = new arrayReverse();
        int[] a = {1,2,3,4,5,6};
        System.out.print("Original Array: ");
        ar.printArray(a);
		ar.reverseArray(a);
		System.out.print("Reversed Array: ");
		ar.printArray(a);
		
		System.out.println("");
		int[] b = {1,2,3,4,5,6,7};
        System.out.print("Original Array: ");
        ar.printArray(b);
		ar.reverseArray(b);
		System.out.print("Reversed Array: ");
		ar.printArray(b);
	}
	
	/**
	 * 
	 * @param a
	 * Method to print the array in a specific format 
	 */
	public void printArray(int[] a){
		System.out.print("[");
		for(int i=0;i<a.length-1;i++){
			System.out.print(a[i]+",");
		}
		System.out.println(a[a.length-1]+"]");
	}
	/*
	 * Expected output
	 * Original Array: [1,2,3,4,5,6]
	   Reversed Array: [6,5,4,3,2,1]

       Original Array: [1,2,3,4,5,6,7]
       Reversed Array: [7,6,5,4,3,2,1]
	 */
}
