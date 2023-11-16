public class Solution {
    public static void alphaHill(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            char ch='A';
            int br=(2*i+1)/2;
            for(int k=1;k<=(2*i+1);k++){
                System.out.print(ch+" ");
                if(k<=br) ch++;
                else ch--;
            }
            System.out.println();
        
        }
    }
}