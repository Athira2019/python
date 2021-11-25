import java.util.PriorityQueue;

//https://www.youtube.com/watch?v=3dqR2nYElyw
public class ConnectSticks{
	public int connectSticks(int[] sticks)
	{
		int cost=0;
		PriorityQueue<Integer> minHeap=new PriorityQueue<>();
		for(int s:sticks)
		{
			minHeap.add(s);
		}
		
		while(minHeap.size()>1)
		{
			int sum=minHeap.remove()+minHeap.remove();
			cost+=sum;
			minHeap.add(sum);
		}
		return cost;
		
	}
}
