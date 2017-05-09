
package algorithms.sorting;

import java.util.Arrays;

public class SelectionSortImplemetation {
	static int input[] = { 5, 3, 2, 1, 4 };

	void sortUsingSelection() {
		int len = input.length;

		for (int i = 0; i < len - 1; i++) {
			int minIndex = i;

			for (int j = i + 1; j < len; j++) {
				if (input[j] < input[minIndex])
					minIndex = j;
			}

			int temp = input[minIndex];
			input[minIndex] = input[i];
			input[i] = temp;
		}
	}

	public static void main(String args[]) {
		
		SelectionSortImplemetation sortImpl = new SelectionSortImplemetation();
		sortImpl.sortUsingSelection();
		
		System.out.println("Sorted Array Using Selection Sort:");
		Arrays.stream(input).forEach(num -> System.out.print(num + " "));

	}
}

