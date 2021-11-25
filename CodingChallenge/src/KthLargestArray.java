
//https://leetcode.com/problems/kth-largest-element-in-an-array/submissions/
import java.util.PriorityQueue;

public class KthLargestArray {
	 public int findKthLargest(int[] nums, int k) {
	        PriorityQueue<Integer> minHeap=new PriorityQueue<Integer>();
	        for(int i:nums)
	        {
	            minHeap.add(i);
	            if(minHeap.size()>k)
	            {
	                minHeap.remove();
	            }
	        }
	          return minHeap.remove();
	    }

}
