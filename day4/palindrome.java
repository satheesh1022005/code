class Solution {
    public boolean isPalindrome(int x) {
        int t=x,sum=0,r;
        while(t!=0){
            sum=(sum*10)+(t%10);
            t/=10;
        }
        if(sum==x && x>=0){
            return true;
        }
        else{
            return false;
        }
        
    }
}