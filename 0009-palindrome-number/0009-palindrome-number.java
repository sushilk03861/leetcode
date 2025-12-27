class Solution {
    public boolean isPalindrome(int x) {
    int dup = x;
     int palin = 0;
    while(x>0){
        int k = x%10;
        palin = palin*10+k;
         x = x/10;
     }   
        if(palin==dup)
        return true;
        else
        return false;
    }
}