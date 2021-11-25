import java.util.HashMap;

public class Interview {
	public int findCern(String para,String word)
	{
		int count=0;
		char[] paraArray=para.toCharArray();
		HashMap<Character,Integer> map=new HashMap<>();
		char[] wordArray=word.toCharArray();
		for(char ch:paraArray)
		{
			
			if(isWordArary(ch,wordArray))
			{ 
				if(map.containsKey(ch))
				{
				map.put(ch,count++);
				}
			}
			
		}
		
		return count;
		
	}

	private boolean isWordArary(char ch, char[] wordArray) {
		
		for(char chWord:wordArray)
		{
		if(ch==chWord)
		{
			return true;
		}
		
		}
			
		return false;
	}

	
	

}
