class Result {

    /*
     * Complete the 'gemstones' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING_ARRAY arr as parameter.
     */

    public static int gemstones(List<String> arr) {
        int map[]=new int[26],add=1,ans=0;
        for(String str:arr){
            for(char c:str.toCharArray()){
                if(map[(int)(c-97)]==add-1)
                map[(int)(c-97)]+=1;
            }
            add+=1;
        }
        for(int i=0;i<26;i++){
            //System.out.println((char)(map[i])+"=="+map[i]);
            if(map[i]>=arr.size()){
                ans++;
            }
        }
        return ans;

    }

}