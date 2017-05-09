
package algorithms.sorting;

import java.util.Arrays;

public class QuickSortImplementation {
	
	static int[] input = { 20, 10, 40, 30, 50, 60, 70 };
 
	public void sort(int low, int high) {
		if (input == null || input.length == 0)
			return;
 
		if (low >= high)
			return;
 
		int middle = low + (high - low) / 2;
		int pivot = input[middle];
 
		int i = low, j = high;
		while (i <= j) {
			while (input[i] < pivot) {
				i++;
			}
 
			while (input[j] > pivot) {
				j--;
			}
 
			if (i <= j) {
				int temp = input[i];
				input[i] = input[j];
				input[j] = temp;
				i++;
				j--;
			}
		}
 
		if (low < j)
			sort(low, j);
 
		if (high > i)
			sort(i, high);
	}
	
	public static void main(String[] args) {
		
		QuickSortImplementation obj=new QuickSortImplementation();
        obj.sort(0, input.length-1);
        
        System.out.println("Sorted Array Using Quick Sort:");
        Arrays.stream(input).forEach(num -> System.out.print(num + " "));
	}
}