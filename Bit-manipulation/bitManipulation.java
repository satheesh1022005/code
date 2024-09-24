



// User function Template for Java

class Solution {
    static void bitManipulation(int num, int i) {
        System.out.print(((num>>(i-1))&1)+" ");
        System.out.print((num|(1<<(i-1)))+" ");
        System.out.print((num&(~(1<<(i-1))))+" ");
    }
}