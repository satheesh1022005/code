public static void reverse(List<Integer> arr,int i,int j){
        //int i=0,j=arr.size();
        while(i<j){
            int t=arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,t);
            i++;
            j--;
        }
    }
    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
                reverse(arr,0,arr.size()-1);
                reverse(arr,0,arr.size()-d-1);
                reverse(arr,arr.size()-d,arr.size()-1);
                return arr;
    }