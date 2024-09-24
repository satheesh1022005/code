class Solution {
  public static int[] count_NGEs(int N, int arr[], int queries, int indices[]) {
    int ans[]=new int[queries];
    int ele,cnt;
    for(int i=0;i<queries;i++){
        ele=arr[indices[i]];
        cnt=0;
        for(int j=indices[i]+1;j<arr.length;j++){
            if(arr[j]>ele) cnt++;
        }
        ans[i]=cnt;
    }
    return ans;
     
  }
}
  