import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MarkAndToys {
	public static int maximumToys(List<Integer> prices, int k) {
        int maxToys=0;
        if(prices.isEmpty() || k==0 ) return maxToys;
    Collections.sort(prices);
    
    List<Integer> temp=new ArrayList<Integer>();
    for(int i:prices)
    {
        if(i<k)
        {
            temp.add(i);
        }
    }
    for(int i:temp)
    {
        k-=i;
        if(k<0) return maxToys;
        maxToys++;
        
    }
    return maxToys;
    }

}

