//Is Unique 1.1
public class IsUnique {
	boolean isUnique(String s)
	{
		if(s.length()>128)
		return false;
		
		
		boolean[] strArray=new boolean[128];
		for(int i=0;i<s.length();i++)
		{int val=s.charAt(i);
		if(strArray[val])
		{
			return false;
		}
		strArray[val]=true;
		}
		return true;
	}

}
