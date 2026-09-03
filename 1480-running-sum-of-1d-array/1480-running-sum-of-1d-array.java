class Solution {
    public int[] runningSum(int[] nums) {
        int sum[] = new int[nums.length];
    int k = 0;
        for(int i = 0;i<=nums.length-1;i++){
              int add = 0;
            for(int j =0;j<=i;j++){
                 add += nums[j];
                 
                
            }
           
         sum[k++] = add;
        }
        return sum;
    }
}