class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for(int num : nums){
            freqMap.put(num, freqMap.getOrDefault(num,0)+1);
        }
        List<Integer>[] bucket = new List[nums.length+1];
        for(int key : freqMap.keySet()){
            int freq = freqMap.get(key);
            if(bucket[freq] == null){
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }
        int[] res = new int[k];
        int count = 0;
        for(int i = bucket.length-1; i>=0 & count < k; i--){
            if(bucket[i] != null){
                for(int num: bucket[i]){
                    res[count++] = num;
                }
            }
        }
        return res;
    }
}