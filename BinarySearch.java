import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class BinarySearch {

	public static void main(String[] args) {
		int[] ints = { 5, 2, 8, 6, 1, 9};
		
		Arrays.sort(ints);
		
		System.out.println("Sorted Array: ");
		for (int val : ints) {
			System.out.print(val + ", ");
		}
		
		System.out.println("\n");
		int start = 0;
		int end = ints.length - 1;
		int target = 9;
		System.out.println("Index of " + target + ": " + recursive_binary_search(ints, start, end, target));
		
	
	}
	
	
	public static int recursive_binary_search(int[] ints, int start, int end, int target) {
		if (start <= end) {
			int curIndex = start + (end - start)/2;
	
			if (ints[curIndex] == target) {
				return curIndex;
			}
			
			if (target < ints[curIndex]) {
				return recursive_binary_search(ints, start, curIndex - 1, target);
			}
			
			if (target > ints[curIndex]) {
				return recursive_binary_search(ints, curIndex + 1, end, target);
			}
		}
		return -1;
	}
	
	/*
	 * I spent hours on this hw assignment, writing a few versions of the code. In the end
	 * I copied the slides, but I'm including a version that I worked on before I looked.
	 */
	public static int recursive_binary_search_WRONG(int[] ints, int start, int end, int target) {
		int curIndex = (end - start)/2;
		System.out.println("Start: " + start + " curIndex: " + curIndex + " end: " + end);

		if (ints[curIndex] == target) {
			return curIndex;
		}
		
		if (target < ints[curIndex]) {
			end = curIndex;
			curIndex = (end - start)/2;
			return recursive_binary_search(ints, start, end, target);
		}
		
		if (target > ints[curIndex]) {
			start = curIndex;
			curIndex = (end - start)/2;

			return recursive_binary_search(ints, start, end, target);
		}
		
		return -1;
	}
		
		
	
	/*
	 * Question 3: Binary Search

		Implement a recursive binary search algorithm. 
		
		Given a sorted array of integers
		write a function to find the index of a target value in the array
		 If the target value is not in the array, return -1.
		 
		 
		start: 0 end: size - 1
		check: middle
		if yes, return middle
		else:
			if greater, start = middle, recursion
			if less, end = middle, recursion
	 */
}
