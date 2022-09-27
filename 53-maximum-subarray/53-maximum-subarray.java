class Solution {
    public int maxSubArray(int[] nums) {
        int temp = nums[0];
        int ans = temp;
        for(int i=1; i<nums.length; i++){
            temp = Math.max(temp+nums[i],nums[i]);
            ans = Math.max(temp, ans);
        }
        return ans;
    }        
}