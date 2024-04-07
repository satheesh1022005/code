import java.util.*;

public class Solution {
    //static int cnt=0;
    public static int mergesort(int arr[],int low,int mid,int high){
        int left=low,right=mid+1,cnt=0;
        ArrayList<Integer> al=new ArrayList<>();
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                al.add(arr[left]);
                left++;
            }
            else{
                al.add(arr[right]);
                cnt+=(mid-left+1);
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
        //System.out.println(al);
        for(int i=0;i<al.size();i++){
            arr[k]=al.get(i);
            k++;
        }
        return cnt;
        
    }
    public static int merge(int arr[],int low,int high){
        int cnt=0;
        if(low>=high)
            return cnt;
        int mid=(low+high)/2;
        cnt+=merge(arr,low,mid);
        cnt+=merge(arr,mid+1,high);
        cnt+=mergesort(arr,low,mid,high);
        return cnt;
    }
    public static int numberOfInversions(int []a, int n) {
        // int cnt=0;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(a[i]>a[j]) cnt++;
        //     }
        // }
        int cnt=merge(a,0,a.length-1);
        // for(int i=0;i<a.length;i++){
        //     System.out.println(a[i]);
        // }
        //System.out.println(cnt);
        return cnt;
        
    }
}