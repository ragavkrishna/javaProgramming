/**
 * author: Ragav Ramakrishnan
 * The comparison model for sorting cannot do better than 'nlgn'. Counting sort usus the power
 * of RAM to sort in linear time. 
 */
import java.util.Arrays;

public class CountingSort {
	/**
	 * 
	 * @param unsorted
	 * The method is used to sort an unsorted array of integers(can be even characters)
	 * The method sorts the array in linear time
	 */
	public void sort(int[] unsorted){
		
		// Length of the input array
		int n = unsorted.length;
		
		// The output array with size equal to the number of elements in the input array
		int[] output = new int[n];
		
		// Count array is used to store the count of keys in the input array
		int[] count = new int[256];
		
		// Initialize count array with all 0s
		for(int i=0;i<256;++i){
			count[i]=0;
		}
		
		// Populate count array with number of times each key appears in the input array
		for(int i=0;i<n;++i){
			++count[unsorted[i]];
		}
		
		/* Count should contain the position of specific input in the input array. 
		 * More specifically, count should know if this 3 came before the other 3 if there
		 * are two 3s in the input*/
		for(int i=1;i<=255;++i){
			count[i] += count[i-1];
		}
		
		// Populate the output array
		for(int i=0;i<n;++i){
			output[count[unsorted[i]]-1] = unsorted[i];
			--count[unsorted[i]];
		}
		
		// Copy the output array to the unsorted array
		for(int i=0;i<n;++i){
			unsorted[i] = output[i];
		}
	}
	
	/*
	 * Driver method that gives in the input and gets the output by calling the sort method
	 */
	public static void main(String args[])
    {
        CountingSort ob = new CountingSort();
        int [] unsorted = {5,3,0,2,4,1,0,5,2,3,1,4}; 
        System.out.println("Before: " + Arrays.toString(unsorted));
     
        ob.sort(unsorted);
        
        // Expected result - After:  [0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5]
        System.out.println("After:  " + Arrays.toString(unsorted));
    }
}
