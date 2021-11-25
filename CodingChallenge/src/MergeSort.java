
public class MergeSort {
void mergeSort(int arr[],int low,int high)
{
	if(low<high)
	{
		return;
	}
	int mid=low+(high-low)/2;
	mergeSort(arr,low,mid-1);
	mergeSort(arr,mid+1,high);
	merge(arr,low,mid,high);
		
}

 void merge(int[] arr, int low, int mid, int high) {
	/*int i=low;
	int j=mid+1;
	int[] aux = new int[arr.length];
	for(int k=low;k<=high;k++)
	{
		aux[k]=arr[k];
	}
	for(int k=low;k<=high;k++)
	{
		if(i>low)
			arr[k]=aux[j++];
		else if(j>high)
			arr[k]=aux[i++];
		else if(aux[j]<aux[i])
			arr[k]=aux[j++];
		else
			arr[k]=aux[i++];
	}
	
}*/
	 
	 int i=low,j=mid+1,k=low;
		int[] aux = new int[arr.length];
	 for( k=low;k<=high;k++)
		{
			aux[k]=arr[k];
		}
	 
	 while(i<=mid && j<=high)
	 {
		 if(aux[i]<= aux[j])
		 {
			 arr[k]=aux[i];
			 i++;
		 }else 
		 {
			 arr[k]=aux[j];
			 j++; 
		 }
		 k++;
	 }
	while(i<=mid)
	{
		arr[k]=aux[i];
		i++;
	}
 }
}
