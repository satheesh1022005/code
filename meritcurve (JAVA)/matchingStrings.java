public static List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
        List<Integer> res=new ArrayList<Integer>();
        int i=0,c=0;
        for(String x:queries){
            c=0;
            for(String y:stringList){
                if(x.equals(y)){
                    c++;
                }
            }
            res.add(c);
        } 
        return res;

    }