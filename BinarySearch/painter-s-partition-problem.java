import java.util.ArrayList;

public class Solution 
{
    public static int check(ArrayList<Integer> al,int li){
        int allocated=1,curr=0;
        for(int i:al){
            if(curr+i<=li){
                curr+=i;
            }
            else{
                allocated++;
                curr=i;
            }
        }
        return allocated;
    }
    public static int findLargestMinDistance(ArrayList<Integer> boards, int k)
    {
            int sum=0,max=0;
            for(int i:boards){
                max=Math.max(i,max);
                sum+=i;
            }
            int l=max,h=sum,mid,al;
            while(l<=h){
                mid=(l+h)/2;
                al=check(boards, mid);
                if(al<=k){
                    h=mid-1;
                }
                else{
                    l=mid+1;
                }
            }
            return l;
        
    }
}