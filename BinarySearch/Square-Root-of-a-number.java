import java.util.* ;
import java.io.*; 

public class Solution {
	public static int sqrtN(long N) {
		long ans=0,l=1,h=N,m;
		while(l<=h){
			m=(l+h)/2;
			if((m*m)<=N){
				ans=m;
				l=m+1;
			}
			else{	
				h=m-1;
			}
		}
		return (int)ans;
	}
}
