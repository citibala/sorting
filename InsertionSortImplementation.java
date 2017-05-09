
package algorithms.sorting;

import java.util.Arrays;

public class InsertionSortImplementation
{
   
	static int input[]={34, 13, 89, 65, 70,10};
	
    void sort()
    {
        int n = input.length;
        for (int i=1; i<n; ++i)
        {
            int selectedElement = input[i];
            int j = i-1;
 
            while (j>=0 && input[j] > selectedElement)
            {
            	input[j+1] = input[j];
                j = j-1;
            }
            input[j+1] = selectedElement;
        }
    }
 
    public static void main(String args[])
    {        
    	
        InsertionSortImplementation obj = new InsertionSortImplementation();        
        obj.sort();
         
        System.out.println("Sorted Array Using Insertion Sort:");
		Arrays.stream(input).forEach(num -> System.out.print(num + " "));
    }
}


