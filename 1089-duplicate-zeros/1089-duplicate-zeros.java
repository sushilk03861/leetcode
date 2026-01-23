class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;

       
        int c =0;
         
        for(int i = 0;i<n;i++){
            if(arr[i]==0){
                c++;
            }
        }
        int start = n-1;
         int end = n+c-1;
        while(start>=0){
            if(end<n){
                arr[end] = arr[start];
              
            }
              end--;
             if(arr[start]==0){
                if(end<n){
                    arr[end]=0;
                   
                }
                 end--;
            }
            start--;
        }

        
    }
}