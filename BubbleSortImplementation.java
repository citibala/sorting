

package algorithms.sorting;

import java.util.Arrays;

public class BubbleSortImplementation {

	static int input[] = { 40, 22, 11, 50, 32, 10, 90 };

	void sort() {
		int len = input.length;
		for (int i = 0; i < len - 1; i++)
			for (int j = 0; j < len - i - 1; j++)
				if (input[j] > input[j + 1]) {
					int temp = input[j];
					input[j] = input[j + 1];
					input[j + 1] = temp;
				}
	}

	public static void main(String args[]) {
		
		BubbleSortImplementation obj = new BubbleSortImplementation();
		obj.sort();
		
		System.out.println("Sorted Array Using BubbleSort:");
		Arrays.stream(input).forEach(num -> System.out.print(num + " "));

	}
}







