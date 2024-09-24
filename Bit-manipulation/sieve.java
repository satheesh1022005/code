

// User function Template for Java

class Solution {
    // You must implement this function
    static void sieve() {}

    static List<Integer> findPrimeFactors(int n) {
       /*List<Integer> al=new ArrayList<>();
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                while(n%i==0){
                    al.add(i);
                    n/=i;
                }
            }
        }
        if(n!=1) al.add(n);
        return al;*/
        int sieve[]=new int[n+1];
        for(int i=2;i<=n;i++){
            sieve[i]=i;
        }
        for(int i=2;i*i<=n;i++){
            if(i==sieve[i]){
                for(int j=i*i;j<=n;j+=i){
                    if(sieve[j]==j)
                        sieve[j]=i;
                }
            }
        }
        List<Integer> al=new ArrayList<>();
        while(n>1){
            al.add(sieve[n]);
            n=n/sieve[n];
        }
        return al;
    }
}