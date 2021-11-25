//https://leetcode.com/problems/jewels-and-stones/submissions/
import java.util.HashSet;

public class JewelsAndStones {
	
	    public int numJewelsInStones(String jewels, String stones) {
	        HashSet<Character> jewelset=new HashSet<Character>();
	        int nums=0;
	        for(char c:jewels.toCharArray())
	        {
	            jewelset.add(c);
	        
	        }
	        for(char c:stones.toCharArray())
	        {
	            if(jewelset.contains(c))
	                nums++;
	        }
	        return nums;
	    }
	}

