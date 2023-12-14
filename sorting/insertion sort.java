public class Solution {
    public static void insertionSort(int[] a, int size) {
        for(int i=0;i<size;i++){
            int j=i;
            while(j>0&&a[j-1]>a[j]){
                int temp=a[j-1];
                a[j-1]=a[j];
                a[j]=temp;
                j--;
            }
        }
    }
}