
import java.util.*;

public class LinkedList_Recursion {

	public static void main(String[] args) {
		int[] ints = {4, 7, 9, 2, 5};
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		for (int num : ints) {
			ll.add(num);
		}
		
		System.out.println(recursive_search(ll, 5));
		

		
	}
	
	public static boolean recursive_search(LinkedList<Integer> ll, int target) {
		boolean result = false;
		
		if (ll.size() == 0) {
			return result;
		}
		if (ll.getFirst() == target || ll.size() == 0) {
			result = true;
			return result;
		}
		
		ll.removeFirst();
		
		return recursive_search(ll, target);
	}

}

