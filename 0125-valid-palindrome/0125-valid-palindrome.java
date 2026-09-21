class Solution {
    public boolean isPalindrome(String s) {
        s = properString(s);
        // System.out.println(s);
        
        int i=0, j=s.length() -1;

        while(i<=j){
            if(s.charAt(i++) != s.charAt(j--)){
                return false;
            }
        }
        return true;
    }

    public String properString(String s) {
        int n = s.length();
        StringBuilder res = new StringBuilder();

        for(int i=0; i<n; i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                if(Character.isUpperCase(s.charAt(i))){
                    res.append(Character.toLowerCase(s.charAt(i)));
                }else {
                    res.append(s.charAt(i));
                }     
            }
        }
        return res.toString();
    }
}