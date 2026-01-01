class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int first = 1;
        int last  = 0;
        int ans  = -1;
        for(int i : nums){
            last = Math.max(last,i);
        }
        while(first<=last){
            int divisior = first + (last-first)/2;
            int sum = 0;
             for(int j = 0;j<nums.length;j++){
                sum += Math.ceil((double) nums[j]/divisior);
                }
                if(sum<=threshold){
                    ans = divisior ;
                    last = divisior - 1;

                }
                else {
                    first = divisior + 1;
                }

        }
        return ans;
        
    }
}