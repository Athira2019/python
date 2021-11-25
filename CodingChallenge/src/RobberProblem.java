//https://www.youtube.com/watch?v=xlvhyfcoQa4
public class RobberProblem {
  public int maxrobbery(int[] arr)
  {
	  
	  if(arr.length == 0 || arr==null)
	  {
	   return 0;
	  }
	  if(arr.length==1)
	  {
		  return arr[0];
		  
	  } if(arr.length==2)
	  {
		  return Math.max(arr[0], arr[1]);
	  }
	
	  
		  int[] dp=new int[arr.length];
		  dp[0]=arr[0];
		  dp[1]=Math.max(arr[0], arr[1]);
		  for(int i=2;i<=arr.length;i++)
		  {
			  dp[i]=Math.max(arr[i]+dp[i-2], dp[i-1]);
		  }
	  
	return dp[arr.length-1];
	  
  }
}
