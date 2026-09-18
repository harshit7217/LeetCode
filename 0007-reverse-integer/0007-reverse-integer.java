class Solution {
    public int reverse(int x) {
        long rev = 0;
        boolean check = false;
        if(x < 0){
            x = x-x-x;
            check = true;
        }
        while(x > 0){
            int rem = x % 10;
            rev = rev * 10 + rem;
            if(rev > Integer.MAX_VALUE){
                return 0;
            }
            x /= 10;
        }
        if(check){
            rev = rev-rev-rev;
        }
        return (int) rev;
    }
}