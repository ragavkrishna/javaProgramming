/**
 * @author Ragav Ramakrishnan
 * Insertion sort algorithm using Java
 * Asymptotic analysis - The worst case running time is THETA(n^2)
 * The algorithm is good for small sizes in input but becomes slower on scaling
 */

public class insertionSort {
	public static void main(String[] args){
		int[] a = {5,6,3,9,11,4,21,92,17};
		int[] result = insertion(a);
		for(int i=0;i<a.length-1;i++){
			System.out.print(result[i]+",");
		}
		System.out.println(result[result.length-1]);
	}
	
	/**
	 * 
	 * @param a
	 * @return a in sorted  order
	 * the algorithm takes an array as input and returns the array in sorted order
	 * This function is called from the main method on a predefined input
	 */
	public static int[] insertion(int[] a){
		int j, i, key;
		for(j=1;j<a.length;j++){
			key = a[j];
			for(i=j-1;(i>=0)&&(a[i]>key);i--){
				a[i+1] = a[i];
			}
			a[i+1]=key;
		}

		return a;
	}
}
