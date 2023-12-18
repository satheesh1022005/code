public class Solution {
    public static int[] getSecondOrderElements(int n, int []a) {
        int max=0,max1=0,min=a[0],min1=min;
        for(int x:a){
            if(x>max){
                max1=max;
                max=x;
            }
            else if(x>max1&&x!=max){
                max1=x;
            }
        }
        min=max;min1=min;
        for(int x:a){
            if(x<min){
                min1=min;
                min=x;
            }
            else if(x<min1&&x!=min){
                min1=x;
            }
        }
        int ans[]={max1,min1};
        return ans;
    }
}