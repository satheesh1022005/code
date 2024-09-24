class Solution {
    public static int oneToXOR(int n){
        if(n%4==1) return 1;
        else if(n%4==2) return n+1;
        else if(n%4==3) return 0;
        else return n;
    }
    public static int findXOR(int l, int r) {
        return oneToXOR(l-1)^oneToXOR(r);
    }
}