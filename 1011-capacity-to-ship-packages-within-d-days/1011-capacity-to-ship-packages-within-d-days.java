class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int first =0;
        int last = 0;
        for (int w :weights){
            first = Math.max(first,w);
            last += w;
        }
        while(first<last){
            int mid  = (first+last)/2;
            int day = 1;
            int curr = 0;
            for(int w:weights){
                if(curr+w>mid){
                    day++;
                    curr = 0;
                }
                
                    curr += w;
                
                
                
            }
            if(day<=days){
                last = mid;
            
            }
            else{
                first = mid +1;
            }

        }
        return first;
    }
}