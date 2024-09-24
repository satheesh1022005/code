class Solution {
    public static void print_divisors(int n) {
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=1;(i*i)<=n;i++){
            if(n%i==0){
                al.add(i);
                if((int)(n/i)!=i){
                    al.add((int)(n/i));
                }
            }
            
        }
        Collections.sort(al);
        for(int i:al){
            System.out.print(i+" ");
        }
    }
}