public static int hourglassSum(List<List<Integer>> arr) {
            int max=Integer.MIN_VALUE,sum;
            for(int i=0;i<6-2;i++){
                
                for(int j=0;j<6-2;j++){
                                                sum=arr.get(i).get(j)+arr.get(i).get(j+1)+arr.get(i).get(j+2)+arr.get(i+1).get(j+1)+arr.get(i+2).get(j)+arr.get(i+2).get(j+1)+arr.get(i+2).get(j+2);                    
                max=Math.max(max,sum);     
                }
            }
        
        return max;
    }