class Solution {
     public void mergesort(int arr[],int low,int mid,int high){
        int left=low,right=mid+1,cnt=0;
        ArrayList<Integer> al=new ArrayList<>();
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                al.add(arr[left]);
                left++;
            }
            else{
                al.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            al.add(arr[left]);
            left++;
        }
        while(right<=high){
            al.add(arr[right]);
            right++;
        }
        int k=low;
        for(int i=0;i<al.size();i++){
            arr[k]=al.get(i);
            k++;
        }
    }
    public int countpairs(int arr[],int low,int mid,int high){
        int right=mid+1,cnt=0;
        for(int i=low;i<=mid;i++){
            while(right<=high && arr[i] > (long)arr[right]*2) right++;
            cnt+=right-(mid+1);
        }
        return cnt;
    }
    public int merge(int arr[],int low,int high){
        int cnt=0;
        if(low>=high)
            return cnt;
        int mid=(low+high)/2;
        cnt+=merge(arr,low,mid);
        cnt+=merge(arr,mid+1,high);
        cnt+=countpairs(arr,low,mid,high);
        mergesort(arr,low,mid,high);
        return cnt;
    }
    public int reversePairs(int[] nums) {
        int cnt=merge(nums,0,nums.length-1);
        return cnt;
    }
}