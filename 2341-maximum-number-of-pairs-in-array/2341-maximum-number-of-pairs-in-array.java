class Solution {
    public int[] numberOfPairs(int[] nums) {
        Arrays.sort(nums);
        int pair = 0;
        int leftover = 0;
        int i = 0 ;
       while(i<nums.length-1){
            if(nums[i]==nums[i+1]){
                pair++;
                i += 2;
            }else{
                leftover++;
                i++;
            }
        }
        if(i==nums.length-1){
            leftover++;
        }
        return new int[]{pair,leftover};
        
    }
}