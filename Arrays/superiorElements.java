
class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        int max=arr[n-1];
        ArrayList<Integer> al=new ArrayList<Integer>();
        al.add(max);
        for(int i=n-2;i>=0;i--){
            if(arr[i]>=max){
                max=arr[i];
                al.add(max);
            }
        }
        Collections.reverse(al);
        return al;
    }
}