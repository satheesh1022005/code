
class Solution {
    public static int totalFruits(Integer[] arr) {
       int l=0,h=0,max=0,n=arr.length,ele1,ele2;
       ele1=arr[l];
       while(h<n&&arr[h]==ele1) h++;
       if(h<n) ele2=arr[h];
       else return n;
       max=Math.max(max,h-l+1);
       //System.out.println(l+","+h+"ele1"+ele1+"ele2"+ele2);
       while(l<n&&h<n){
           if(arr[h]==ele1||arr[h]==ele2) 
           {
               h++;
               max=Math.max(max,h-l);
           }
           else{
               max=Math.max(max,h-l);
               l=h-1;
               ele1=arr[l];
               while(l>=0&&arr[l]==ele1) l--;
               l++;
               if(l>=0){
                   ele2=arr[h];
               }
           }
       }
       return max;
    }
}