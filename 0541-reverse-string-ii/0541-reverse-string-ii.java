class Solution {
    public String reverseStr(String s, int k) {
        int n = s.length();
        List<String> str = new ArrayList<>();

        for(int i=0; i<n; i+=k){
            if(i+k < n){
                str.add(s.substring(i, i+k));
            }else {
                str.add(s.substring(i, n));
            }
        }

        // System.out.println(str.toString());

        int len = str.size();
        StringBuilder res = new StringBuilder();

        for(int i=0; i<len; i++){
            if(i%2==0){
                // System.out.println("yes");
                String temp = str.get(i);
                for(int j=temp.length()-1; j>=0; j--){
                    res.append(temp.charAt(j));
                }
            }else {
                String temp = str.get(i);
                for(int j=0; j<temp.length(); j++){
                    res.append(temp.charAt(j));
                }
            }
        }
        return res.toString();
    }
}