/**
 * 
 * @author ragavramakrishnan
 * The program is used to add the 'x' at the appropriate location in the sorted array
 */

public class zeroAtEnd {
	/**
	 * 
	 * @param array
	 * @param x
	 * @return array with x inserted in the appropriate location
	 * The method takes a sorted array with 0 at the end as input and inserts 'x' at the
	 * appropriate location so that the array remains sorted.
	 */
	public static int[] insert(int[] array, int x){
		if(array[array.length-1]!=0 || x<0){
			System.out.println("Conditions are not satisfied. Array not modified!");
			return array;
		}
		
		for(int i=0;i<array.length;i++){
			if(array[i]>x || array[i] ==0){
				int temp = array[i];
				array[i] = x;
				x = temp;
			}
		}
		return array;
	}
	
	/* Driver method which provides the input and calls the insert method to insert the 
	   new integer in the appropriate location */
	
	public static void main(String[] args){
		int[] a = {2,3,7,8,9,0};
		a = insert(a,4);
		System.out.print("[");
		for(int i=0;i<a.length-1;i++){
			System.out.print(a[i]+",");
		}
		System.out.println(a[a.length-1]+"]");
	}
	/*
	 * Expected Output:
	 * [2,3,4,7,8,9]
	 */
}
