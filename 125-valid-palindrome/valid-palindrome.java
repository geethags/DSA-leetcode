class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        if(s.isEmpty()){
            return true;
        }
        while(left < right){
            while(left < right && !checkChar(s.charAt(left))){
                left++;
            }
            while(left < right && !checkChar(s.charAt(right))){
                right--;
            }
            if(
                Character.toLowerCase(s.charAt(left)) != 
                Character.toLowerCase(s.charAt(right))
                ) return false;
            left++;
            right--;
        }
        return true;
    }

    public Boolean checkChar(char c){
        return (
        c >= 'A' && c <= 'Z' ||
        c >= 'a' && c <= 'z' ||
        c >= '0' && c <= '9'
        );
    }
}