class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans =new int[nums.length];
        Arrays.fill(ans, 1);
        int prefix = 1, post = 1;
        for(int i =0 ;i<nums.length;i++){
            ans[i] = prefix;
            prefix = nums[i]*prefix;
        }

        for(int i = nums.length - 1; i>=0; i--){
            ans[i] = ans[i]*post;
            post = nums[i]*post;
        }
        return ans;
    }
}