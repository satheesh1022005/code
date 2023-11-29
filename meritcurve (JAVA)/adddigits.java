class Solution {
   /* public int SepAdd(int num){
        int sum=0;
        while(num!=0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }*/
    public int addDigits(int num) {
        /*while(num%10!=num){
            num=SepAdd(num);
        }
        return num;*/
        if(num==0) return num;
        return num%9==0?9:num%9;
    }
}