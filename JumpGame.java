class Solution {
    public boolean canJump(int[] nums) {
    int n = nums.length;
    int x = n-1;
    for(int i = x ; i > -1 ; i--){
          if(nums[i]+i >= x){
                x=i;
            } 
        }
    if(x==0){
        return true;
    }

        return false;


}
}