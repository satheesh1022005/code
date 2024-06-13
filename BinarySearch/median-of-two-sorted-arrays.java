class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        /*int cnt=0;
        int i=0,j=0,n=nums1.length,m=nums2.length;
        int el1=0,el2=0,in2=(n+m)/2,in1=in2-1;
        while(i<n && j<m){
            if(nums1[i]<=nums2[j]){
                if(cnt==in1) el1=nums1[i];
                if(cnt==in2) el2=nums1[i];
                cnt++;
                i++;
            }
            else if(nums1[i]>nums2[j]){
                if(cnt==in1) el1=nums2[j];
                if(cnt==in2) el2=nums2[j];
                cnt++;
                 j++;
            }
        }
        while(i<n){
            if(cnt==in1) el1=nums1[i];
            if(cnt==in2) el2=nums1[i];
            cnt++;
            i++;
        }
        while(j<m){
            if(cnt==in1) el1=nums2[j];
            if(cnt==in2) el2=nums2[j];
            cnt++;
            j++;
        }
        if((n+m)%2==0) return (double)(el1+el2)/2.0;
        return el2;
        //return ans/2.0;*/
        int n=(nums1.length+nums2.length);
        int n1=nums1.length,n2=nums2.length;
        if(n1>n2) return findMedianSortedArrays(nums2,nums1);
        
        int l=0,h=n1,left=(n1+n2+1)/2,mid1,mid2,l1,l2,r1,r2;
        while(l<=h){
            mid1=(l+h)/2;
            mid2=left-mid1;
            l1=Integer.MIN_VALUE;
            l2=Integer.MIN_VALUE;
            r1=Integer.MAX_VALUE;
            r2=Integer.MAX_VALUE;
            if(mid1<n1) r1=nums1[mid1];
            if(mid2<n2) r2=nums2[mid2];
            if((mid1-1)>=0) l1=nums1[mid1-1];
            if((mid2-1)>=0) l2=nums2[mid2-1];
            if(l1<=r2 && l2<=r1){
                if(n%2!=0){
                    return Math.max(l1,l2);
                }else{
                    return (double)(Math.max(l1,l2)+Math.min(r1,r2))/2.0;
                }
            }
            else if(l1>r2){
                h=mid1-1;
            }
            else{
                l=mid1+1;
            }
        }
        return 0.0;

    }
}