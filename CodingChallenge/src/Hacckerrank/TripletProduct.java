package Hacckerrank;
import java.util.HashMap;

public class TripletProduct {
	public  int countTriplets(int arr[], int n, int m)
	{
		int count=0;
		HashMap<Integer,Integer> occ=new HashMap<>();
		for(int i:arr)
		{
			occ.put(arr[i], i);
		}
		
		for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
		{  if ((arr[i] * arr[j] <= m) && (arr[i] * arr[j] != 0) && (m % (arr[i] * arr[j]) == 0)) {
            int check = m / (arr[i] * arr[j]);
            
            occ.containsKey(check);

            // Check if the third number is present
            // in the map and it is not equal to any
            // other two elements and also check if
            // this triplet is not counted already
            // using their indexes
            if (check != arr[i] && check != arr[j]
                && occ.containsKey(check) && occ.get(check) > i
                && occ.get(check) > j)
                count++;
        }
    }
}


			
		}
	
		// Return number of triplets
		return count;
}
}
