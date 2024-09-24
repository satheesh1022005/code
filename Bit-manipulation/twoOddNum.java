//User function Template for Java
class Solution
{
    public int[] twoOddNum(int nums[], int N)
    {
        int xor=0;
        for(int i:nums){
            xor=xor^i;
        }
        int rightmost=(xor&xor-1)^xor;
        int b1=0,b2=0;
        for(int i:nums){
            if((i&rightmost)!=0){
                b1=b1^i;
            }else{
                b2=b2^i;
            }
        }  
        if(b1<b2){
            b1=b1^b2;
            b2=b1^b2;
            b1=b1^b2;
        }
        return new int[]{b1,b2};
    }
}