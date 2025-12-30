class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int first = 1;
        int last  = 0;
        int ans = -1;
        for(int i : piles){
         last = Math.max(last,i);
        }
        while(first<last){
            int mid = first+(last-first)/2;
            int hours = 0;
            for(int j:piles){
                hours += (j+mid-1)/mid;
            }
            if(hours<=h){
                last = mid;
            }
            else{
                first = mid+1;
            }
            
        }
        return first;
       
      


        
    }
}