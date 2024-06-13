
class Solution {
    public static int check(double dis,int stations[]){
        int cnt=0;
        for(int i=1;i<stations.length;i++){
            double diff=(stations[i]-stations[i-1])/dis;
            if((stations[i]-stations[i-1])%dis==0){
                cnt+=diff-1;
            }
            else{
                cnt+=diff;
            }
        }
        return cnt;
    }
    public static double findSmallestMaxDist(int stations[], int k) {
        /*int n=stations.length;
        int section[]=new int[n-1];
        for(int i=0;i<n-1;i++) section[i]=0;
        double maxLength=-1;
        int maxIndex=-1;
        for(int i=1;i<=k;i++){
             maxLength=-1;
             maxIndex=-1;
            for(int j=0;j<n-1;j++){
                double diff=stations[j+1]-stations[j];
                double len=diff/(double)(section[j]+1);
                //System.out.println(len+"=>"+stations[j]);
                if(maxLength<len){
                    maxLength=len;
                    maxIndex=j;
                }
            }
            section[maxIndex]++;
        }
        double maxAns=-1;
        for(int i=0;i<n-1;i++){
            double diff=(stations[i+1]-stations[i])/((double)section[i]+1);
            //System.out.println(diff);
            maxAns=Math.max(maxAns,diff);
        }
        return maxAns;*/
        int max=-1;
        for(int i=1;i<stations.length;i++){
            max=Math.max(max,stations[i]-stations[i-1]);
        }
        double l=0,h=max,mid;
        int c;
        while((h-l)>(Math.pow(10,-6))){
            mid=(l+h)/2;
            c=check(mid,stations);
            if(c>k){
                l=mid;
            }
            else{
                h=mid;
            }
        }
        return h;
        
    }
}