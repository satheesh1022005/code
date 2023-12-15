import java.util.*;
public class Solution {
	public static long reverseBits(long n) {
	int bin=0,r;
	long x;
	int arr[]=new int[32];
	
		bin=0;
		x=n;
		int k=0;
		while(x>0){
			arr[k]=(int)x%2;
			k++;
			x/=2;
		}
		//calculation
		int p=0,val=0;
		long ans=0;
		for(int j=(arr.length-1);j>=0;j--){
			if(arr[j]==1){
				val=31-p;
				ans+=Math.pow(2,p);
				arr[j]=0;
			}
			p++;
		}
		

	
    return ans;
	

	}
}
