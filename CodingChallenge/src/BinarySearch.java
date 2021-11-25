
public class BinarySearch {
//The time complexity of the binary search algorithm is O(log n). Linear search o(n).
	public boolean binarySearchRecursive(int array[],int searchValue,int left,int right)
	{ 
		if(left > right) {
		    return false;
		}
		// Calculate a middle value
		int mid = left + ((right - left) / 2);

		// If the search value is found at the middle of the current search range
		if(array[mid] == searchValue) {
		    return true;
		}
		// If the search value would fall in the left half of the dataset (i.e., less than middle)
		else if(searchValue < array[mid]) {
			binarySearchRecursive(array, searchValue, left, mid-1);
		}
		// Else, the search value can only fall in the right half of the dataset (i.e., greater than middle)
		else {
			binarySearchRecursive(array, searchValue, mid+1, right);
		}
		// This is only reached if the search value was never found
		return false;
	}
	
	public boolean binarySearchIterative(int[] array,int searchValue)
	{
		// Initialize search bounds to the length of the array
		int left = 0; 
		int right = array.length - 1;

		// If the only possible location of the value is outside of the current search bounds, it doesn't exist in the array
		while(left <= right) {
			// Calculate a middle value
		    int mid = left + (right - left) / 2;
		    
		    // If the search value is found at the middle of the current search range
		    if(array[mid] == searchValue) {
		        return true;
		    }
		    // If the search value would fall in the left half of the dataset (i.e., less than middle), search left
		    else if(searchValue < array[mid]) {
		        right = mid - 1;
		    }
		    // Else, the search value can only fall in the right half of the dataset (i.e., greater than middle), search right
		    else { 
		        // search right
		        left = mid + 1;
		    }
		}
		// This is only reached if the search value was never found
		return false;
	}
}
