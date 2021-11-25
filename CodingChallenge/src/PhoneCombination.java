//https://leetcode.com/problems/letter-combinations-of-a-phone-number/submissions/
import java.util.ArrayList;
import java.util.List;

public class PhoneCombination {
	  public List<String> letterCombinations(String digits) {
	        List<String> result=new ArrayList<String>();
	        if(digits==null ||digits.length()==0)
	        {
	            return result;
	        }
	        String[] mappings={
	            "0",
	            "1",
	             "abc",
	            "def",
	            "ghi",
	            "jkl",
	            "mno",
	            "pqrs",
	            "tuv",
	            "wxyz"
	        };
	        lettercombinationRecursive(result,digits,"",0,mappings);
	        return result;
	        
	       
	        
	    }
	    public void lettercombinationRecursive(List<String> result,String  digits,String current,int index,String[] mappings)
	    {
	        if(index==digits.length())
	        {
	            result.add(current);
	            return;
	        }
	        String letters=mappings[digits.charAt(index)-'0'];
	        for(int i=0;i<letters.length();i++)
	        {
	             lettercombinationRecursive(result,digits,current+letters.charAt(i),index+1,mappings);
	        }
	        
	    }
}
