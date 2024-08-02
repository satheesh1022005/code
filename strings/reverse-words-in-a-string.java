class Solution {
    public String reverseWords(String s) {
        // ArrayList<String> li=new ArrayList<>();
        // String temp="";
        // for(char c:s.toCharArray()){
        //     if(c!=' '){
        //         temp+=c;
        //     }
        //     else{
        //         if(temp.length()!=0){
        //             li.add(temp);
        //             temp="";
        //         }
        //     }
        // }
        // if(temp.length()!=0)
        // li.add(temp);
        // Collections.reverse(li);
        // System.out.println(li);
        // String ans="";
        // for(int i=0;i<li.size();i++){
        //     if(i!=li.size()-1){
        //         ans+=li.get(i);
        //         ans+=" ";
        //     }else{
        //         ans+=li.get(i);
        //     }
        // }
        // return ans;
        String str[]=s.trim().split("\\s+");
        String ans="";
        int i=0,j=str.length-1;
        while(i<j){
            String temp=str[i];
            str[i]=str[j];
            str[j]=temp;
            i++;
            j--;
        }
        return String.join(" ",str);
    }
}