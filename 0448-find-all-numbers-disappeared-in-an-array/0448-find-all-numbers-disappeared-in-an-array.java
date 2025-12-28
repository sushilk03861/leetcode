class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
       List<Integer>List = new ArrayList<>();
       int i = 0;
       while(i<nums.length){
        int indx = nums[i]-1;
        if(nums[i]!=nums[indx]){
            int swap = nums[i];
            nums[i]=nums[indx];
            nums[indx]=swap;
        }
        else{
            i++;
        }
       } 
       for(int index = 0;index<nums.length;index++){
        if(nums[index]!=index+1){
            List.add(index+1);
        }
       }
       return List;
    }
}