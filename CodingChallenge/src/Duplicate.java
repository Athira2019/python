import java.util.HashMap;
import java.util.HashSet;

public class Duplicate {
	
	public boolean findDuplicateInteger(int[] nums) {
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i : nums) {
			if (set.contains(i)) {
				return true;
			} else {
				set.add(i);
			}
		}

		return false;

	}
	
	public boolean findDuplicateAndwithK(int[] nums,int k)
	{
		
		HashMap<Integer, Integer> map=new HashMap<>();
		for(int i=0;i<nums.length;i++)
		{ int current=nums[i];
			if(map.containsKey(current) && i-map.get(current)<=k)
			{
				return true;
			}else
			{map.put(current,i);
				
			}
		}
		return false;
		
	}
	
}
