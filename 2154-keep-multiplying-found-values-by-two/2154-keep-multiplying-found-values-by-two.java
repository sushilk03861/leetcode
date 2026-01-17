class Solution {
    public int findFinalValue(int[] nums, int original) {
        HashSet<Integer>set = new HashSet<>();
        for(int add : nums){
         set.add(add);
        }
        int count = 0;
    
        for(int i = 0;i<nums.length;i++){
            if(set.contains(original)){
                original = 2*original;
                count = original;
            }
            else{
                return original;
            }
        }

        
        return count;
        
    }
}