// User function Template for Java

class CheckBit {
    // Function to check if Kth bit is set or not.
    static boolean checkKthBit(int n, int k) {
        return ((n>>k)&1)==1;
    }
}