class Solution {
    public boolean isSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public void reverse(int arr[]){
        int t=arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
                arr[i]=arr[i-1];
        }
        arr[0]=t;

    }
    public boolean check(int[] nums) {
        boolean checked[]=new boolean[100];
        if(isSort(nums)){
            return true;
        }
        for(int i=0;i<nums.length;i++){
            if(checked[i]!=true){
                checked[i]=true;
                reverse(nums);
                if(isSort(nums)){
                return true;
                }
            }
            else{
                return false;
               
            }
        }
        return false;

        


    }
}