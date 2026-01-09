class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>set = new HashSet<>();
        
        for(int c:nums1 ){
            set.add(c); 
        }
        HashSet<Integer> ans = new HashSet<>();
        for(int  i : nums2){
            if(set.contains(i)){
                ans.add(i);

            }
        }
        int res[] = new int[ans.size()];
        int i = 0;
        for(int j : ans){
            res [i++]= j;
            
        }
        return res;

    }
}