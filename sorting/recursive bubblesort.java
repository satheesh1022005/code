if(n==1)
       {
           return ;
       }
       int i=0;
       while(i<n-1){
           //System.out.println(arr[i]+"<="+arr[i-1]);
           if(arr[i]>arr[i+1]){
               int temp=arr[i];
               arr[i]=arr[i+1];
               arr[i+1]=temp;
           }
           i++;
           
       }
       bubbleSort(arr, n-1);