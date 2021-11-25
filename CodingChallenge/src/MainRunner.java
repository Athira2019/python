import java.util.ArrayList;
import java.util.List;

public class MainRunner {

	public static void main(String[] args) {
		Duplicate duplicate=new Duplicate();
		 int[] arr;
         
	      // allocating memory for 5 integers.
	      arr = new int[5];
	          
	      arr[0] = 10;
	          
	      arr[1] = 20;
	          
	      arr[2] = 30;
	      arr[3] = 40;
	      arr[4] = 40;
		System.out.println(duplicate.findDuplicateInteger(arr));
		System.out.println(duplicate.findDuplicateAndwithK(arr, 4));
		
		//RottenOranges rottenOranges=new RottenOranges();
		
	}

}
