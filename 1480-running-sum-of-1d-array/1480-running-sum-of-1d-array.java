class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int ans[] = new int [n];
        int sum = 0;
        for(int i= 0;i<=n-1;i++){
            ans[i] = nums[i] + sum;
                sum = ans[i];
        }
        return ans;
        
    }
}