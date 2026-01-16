class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
       
        int temp [] = new int [n] ;
        for(int i = 0;i<k;i++){
            temp[i]=nums[n-k+i];
        }
        for(int j = k;j<nums.length;j++){
            temp[j] = nums[j-k];
        }
        for(int v = 0 ;v<temp.length;v++){
           nums[v] = temp[v];
        }}}