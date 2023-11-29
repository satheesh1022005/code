 public static int beautifulDays(int i, int j, int k) {
            float a; 
            int ans=0;
            for(int day=i;day<=j;day++){
                int re=rev(day);
                a=(float)(Math.abs(day-re))/(float)k;
                
               // System.out.println("*"+re);
                //System.out.println(a);
                if(a%1==0){
                    //System.out.println("hello");
                    ans++;
                }
            }
        return ans;
    }
