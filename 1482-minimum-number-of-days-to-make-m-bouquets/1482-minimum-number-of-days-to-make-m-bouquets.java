class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if(m*k > bloomDay.length){
            return -1;
        }
        int first = 0;
        int last = 0;
        int ans = -1;
        for(int i : bloomDay){
             last = Math.max(last,i);
        }
        while(first<=last){
            int assumeday = first+(last-first)/2;
             int flower = 0;
             int bouquet = 0;
             for(int j = 0;j<bloomDay.length;j++){
                if(bloomDay[j]<=assumeday){
                    flower++;
                    if(flower>=k){
                        bouquet++;
                        flower = 0;
                    }
                }
                else{
                    flower = 0;
                }
             }
             if(bouquet>=m){
                ans = assumeday;
                last = assumeday -1;
             } 
             else {
                first = assumeday + 1;
             }       
             }
             return ans;
        
    }
}