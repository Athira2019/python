import java.util.Arrays;


//https://leetcode.com/problems/meeting-rooms/
//https://www.youtube.com/watch?v=i2bBG7CaVxs
public class MeetingRooms {
public class Intervals {
  int start;
  int end;
	}

public boolean canAttendMeting(Intervals[] intervals)
{
	int[] start=new int[Intervals[] size];
	int [] end=new int[Intevals[] size];
	for(int i=0;i<intervals.length;i++)
	{
		start[i]=intervals[i].start;
		end[i]=intervals[i].end;
		
	}
	Arrays.parallelSort(start);
	Arrays.parallelSort(end);
	for(int i=0;i<start.length-1;i++)
	{
		if(start[i+1]<end[i])
		{
			return false;
		}
	
	}
	return true;
}
}
