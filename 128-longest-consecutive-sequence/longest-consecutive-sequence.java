class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        if(nums.length == 0) return 0;
        for(int num : nums){
            set.add(num);
        }
        int maxLength = 1;
        for(int num: set){
            if(!set.contains(num-1)){
                int currentLength = 1;
                while(set.contains(num+1)){
                    currentLength++;
                    num++;
                }
                maxLength = Math.max(maxLength, currentLength);
            }
        }
        return maxLength;
    }
}