class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0) return new ArrayList();

        Map<String, List> map = new HashMap<>();
        for(String str : strs){
            char[] count = new char[26];
            for(char c : str.toCharArray()){
                count[c - 'a']++;
            }
            String key = new String(count);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList());
            }
            map.get(key).add(str);
        }
        return new ArrayList(map.values());


    }
}