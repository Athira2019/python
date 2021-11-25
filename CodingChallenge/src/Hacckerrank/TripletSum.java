package Hacckerrank;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TripletSum {
	 static long triplets(int[] a, int[] b, int[] c) {

	        long distinctTripletCount = 0;

	        int[] distinctA = removeDuplicates(a);
	        int[] distinctB = removeDuplicates(b);
	        int[] distinctC = removeDuplicates(c);

	        Arrays.sort(distinctA);
	        Arrays.sort(distinctB);
	        Arrays.sort(distinctC);

	        for (int q : distinctB) {
	            long c1 = getValidIndex(distinctA, q) + 1;
	            long c3 = getValidIndex(distinctC, q) + 1;
	            distinctTripletCount += c1 * c3;
	        }

	        return distinctTripletCount;

	    }

	    private static int[] removeDuplicates(int[] a) {
	        Set<Integer> set = new HashSet<>();
	        for (int item : a) {
	            set.add(item);
	        }
	        int len = set.size();

	        int result[] = new int[len];
	        int i = 0;
	        for (int item : set) {
	            result[i++] = item;
	        }
	        return result;
	    }

	    static int getValidIndex(int[] distinctA, int key) {
	        int low = 0;
	        int high = distinctA.length - 1;
	        int count = -1;

	        while (low <= high) {
	            int mid = low + (high - low) / 2;
	            if (distinctA[mid] <= key) {
	                count = mid;
	                low = mid + 1;
	            } else
	                high = mid - 1;
	        }
	        return count;

	    }
	    
}
