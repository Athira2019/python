//Complexity best:o(nlogn) ,worst o(n2)

public class QuickSortAlgorith {
	void quickSort(int[] arr,int left,int right)
	{
		int index=partition(arr,left,right);
		if(left<index)
		{
			quickSort(arr,left,index-1);
		}
		if(right<index)
		{
			quickSort(arr,index,right);
		}
	}

	private int partition(int[] arr, int left, int right) {
	int pivot=arr[(left+right)/2];
	while(left<=right)
	{
	while(arr[left]<pivot)left ++;
	while(arr[right] >pivot) right--;
	
	if(left<=right)
	{
		swap(arr,left,right);
	left++;
	right--;
	}
	}
		return left;
	}
	

    private static void swap(int[] array, int a, int b)
    {
       int temp;

       temp = array[a];
       array[a] = array[b];
       array[b] = temp;
    }
}
