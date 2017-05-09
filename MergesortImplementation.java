
package algorithms.sorting;

import java.util.Arrays;

public class MergesortImplementation {
    
	static int[] input= { 20, 10, 40, 30, 50, 60, 70 };
    static int[] buffer=new int[7];

     void sort(int low, int high) {
           
            if (low < high) {
                    int middle = low + (high - low) / 2;
                    sort(low, middle);
                    sort(middle + 1, high);
                    mergeSortedArray(low, middle, high);
            }
    }

    void mergeSortedArray(int low, int middle, int high) {

            for (int i = low; i <= high; i++) {
            	buffer[i] = input[i];
            }

            int i = low;
            int j = middle + 1;
            int k = low;
            
            while (i <= middle && j <= high) {
                    if (buffer[i] <= buffer[j]) {
                    	input[k] = buffer[i];
                            i++;
                    } else {
                    	input[k] = buffer[j];
                            j++;
                    }
                    k++;
            }
            
            while (i <= middle) {
            	input[k] = buffer[i];
                    k++;
                    i++;
            }

    }
    
public static void main(String[] args) {
		
	    MergesortImplementation obj=new MergesortImplementation();
        obj.sort(0, input.length-1);
        
        System.out.println("Sorted Array Using Merge Sort:");
        Arrays.stream(input).forEach(num -> System.out.print(num + " "));
	}
    
    
}