import java.util.HashSet;

//https://leetcode.com/problems/missing-number/submissions/
public class MissingNumber {
	   public int missingNumber(int[] nums) {
	        int sum=0;
	        for(int i:nums)
	        {
	            sum+=i;
	        }
	        int n=nums.length+1;
	        return (n*(n-1))/2-sum;
	    }
	   public int missingNumber1(int[] nums) {
	       HashSet<Integer> set=new HashSet<Integer>();
	       for(int i:nums)
	       {
	    	   set.add(i);
	       }
	       for(int i=0;i<=nums.length;i++) {
	       if(!set.contains(i))
	       {
	    	   return i;
	       }
	      
	    }
	       return -1;       
}
}
