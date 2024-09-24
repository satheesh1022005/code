



class Solution
{   
    public boolean isPrime(int x){
        for(int i=2;i<=((int)Math.sqrt(x));i++){
            if(x%i==0){
                return false;
            }
        }
        return true;
    }
    public int[] AllPrimeFactors(int N)
    {
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=2;i<=N;i++){
            if(N%i==0&&isPrime(i)){
                al.add(i);
            }
        }
        int pfactors[] = new int[al.size()];
        for(int i=0;i<al.size();i++){
            pfactors[i]=al.get(i);
        }
        return pfactors;
    }
}