class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        int[] count = new int[26];

        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        for(char ch : sChar){
            count[ch - 'a']++;
        }

        for(char ch : tChar){
            count[ch - 'a']--;
            if(count[ch-'a'] < 0){
                return false;
            }
        }
        return true;
    }
}