import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ProfitTarget {
	 public int[] twoSum(int[] nums, int target)
	 {   int result[]=new int[2];
		 if(nums==null || nums.length==0)
		 {
			 return result;
		 }
		 HashMap<Integer,Integer> map =new HashMap<>();
		 for(int i:nums)
		 {
			 int difference=target-nums[i];
			 if(map.containsKey(difference))
			 {
			     result[0]=i;
	             result[1]=map.get(difference);
	               return result;
	            }
	            map.put(nums[i],i);
			 }
		 
		return result;
		 
	 }
	 public static int uniquePairs(int[] nums, int target){
	        Set<Integer> set = new HashSet<Integer>();
	        Set<Integer> seen = new HashSet<Integer>();
	        int count = 0;
	        for(int num : nums){
	            if(set.contains(target-num) && !seen.contains(num)){
	                count++;
	                seen.add(target-num);
	                seen.add(num);
	            }
	            else if(!set.contains(num)){
	                set.add(num);
	            }

	        }

	        return count;
	    }
	 
	 public int[] twoSumSorted(int[] numbers, int target) {
			if (numbers == null || numbers.length == 0)
				return null;
		 
			int i = 0;
			int j = numbers.length - 1;
		 
			while (i < j) {
				int x = numbers[i] + numbers[j];
				if (x < target) {
					++i;
				} else if (x > target) {
					j--;
				} else {
					return new int[] { i + 1, j + 1 };
				}
			}
		 
			return null;
		}
}
