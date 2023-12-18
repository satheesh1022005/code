
public class Solution {
	public static int sort(int arr[],int low,int high){
		int pivot=low,i=low,j=high,temp;
		while(i<j){
			while(arr[i]<=arr[pivot]&&i<=high-1){
				i++;
			}
			while(arr[j]>arr[pivot]&&j>=low+1){
				j--;
			}
			if(i<j){
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		temp=arr[pivot];
		arr[pivot]=arr[j];
		arr[j]=temp;
		return j;
	}
	public static void quickSort(int[] arr,int low, int high) {
		if(low<high){
			int pIndex=sort(arr,low,high);
			quickSort(arr, low, pIndex-1);
			quickSort(arr, pIndex+1 , high);
		}
		
	}
	
}