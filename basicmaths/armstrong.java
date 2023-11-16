import java.util.*;
import java.lang.*;
public class Main {
	static int size(int x){
		int i=0;
		while(x!=0){
			i++;
			x/=10;
		}
		return i;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int sum=0,r,t=n;
		int l=size(n);
		while(t!=0){
			sum+=Math.pow((t%10),l);
			t/=10;
		}
		if(sum==n){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}



	}
}
