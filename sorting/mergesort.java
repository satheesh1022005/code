class Solution
{
    void merge(int arr[], int l, int m, int r)
    {
        ArrayList<Integer> al=new ArrayList<Integer>();
        int left=l;
        int right=m+1;
         while(left<=m&&right<=r){
             if(arr[left]<=arr[right]){
                 al.add(arr[left]);
                 left++;
             }
             else{
                 al.add(arr[right]);
                 right++;
             }
         }
         while(left<=m){
             al.add(arr[left]);
             left++;
         }
         while(right<=r){
             al.add(arr[right]);
             right++;
         }
         int k=l;
        for(int i=0;i<al.size();i++){
            arr[k]=al.get(i);
            k++;
        }
    }
    void mergeSort(int arr[], int l, int r)
    {
        if(l==r){
            return ;
        }
        int m=(l+r)/2;
        mergeSort(arr,l,m);
        mergeSort(arr,m+1,r);
        merge(arr,l,m,r);
    }
}