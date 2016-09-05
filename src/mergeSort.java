/**
 * 
 * @author ragavramakrishnan
 * This program implements the Merge Sort algorithm which is a recursive algorithm
 * The complexity of merge sort is O(nlgn). The merge sort algorithm is based on a 
 * comparison model.
 */
public class mergeSort {
     
    private int[] array;
    private int[] tempMergArr;
    private int length;
    
    // Driver method. The main method for the program
    public static void main(String a[]){
         
        int[] inputArr = {45,23,11,89,77,98,4,28,65,43};
        mergeSort mms = new mergeSort();
        // Call the sort method to sort the input array
        mms.sort(inputArr);
        for(int i:inputArr){
            System.out.print(i);
            System.out.print(" ");
        }
    }
    
    /**
     * 
     * @param inputArr
     * The sort method takes an input array and sorts it using merge sort
     */
    public void sort(int inputArr[]) {
        this.array = inputArr;
        this.length = inputArr.length;
        this.tempMergArr = new int[length];
        doMergeSort(0, length - 1);
    }
    
    /**
     * 
     * @param lowerIndex
     * @param higherIndex
     * Recursively divide the array until the array is split into it's individual elements
     * Each element in the array is already sorted and then merge them 
     */
    private void doMergeSort(int lowerIndex, int higherIndex) {
         
        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            // Below step sorts the left side of the array
            doMergeSort(lowerIndex, middle);
            // Below step sorts the right side of the array
            doMergeSort(middle + 1, higherIndex);
            // Now merge both sides
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }
    
    /**
     * 
     * @param lowerIndex
     * @param middle
     * @param higherIndex
     * Merge the left and the right part of the array
     */
    private void mergeParts(int lowerIndex, int middle, int higherIndex) {
 
        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergArr[i] = array[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempMergArr[i] <= tempMergArr[j]) {
                array[k] = tempMergArr[i];
                i++;
            } else {
                array[k] = tempMergArr[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = tempMergArr[i];
            k++;
            i++;
        }
        
        while (j <= higherIndex) {
            array[k] = tempMergArr[j];
            k++;
            j++;
        }
 
    }
}
