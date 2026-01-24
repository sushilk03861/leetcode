class Solution {
    public int[] replaceElements(int[] arr) {
        int n  = arr.length;
       int ans[] = new int[n];
       ans[n-1] = -1;
       int k = Integer.MIN_VALUE;
       for(int i = 0;i<n-1;i++){
        for(int j = i+1;j<n;j++){
            k = Math.max(arr[j],k);
            }
            ans[i] = k;
            k = Integer.MIN_VALUE;
        }
       
       return ans;
        
    }
}