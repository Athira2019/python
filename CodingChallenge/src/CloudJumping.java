import java.util.List;

//https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem

public class CloudJumping {
	 public static int jumpingOnClouds(List<Integer> c) {
		 
		 int count= -1;
		 for(int i=0;i<c.size();i++,count++)
		 {
			 if(i+2 < c.size() && c.get(i+2)==0)
			 {
				i++; 
			 }
		 }
		return count;
		

		    }

}
