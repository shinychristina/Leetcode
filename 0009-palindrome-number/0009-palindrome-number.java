class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int tot = 0;
        int temp = x;

        while (x > 0) {
            tot = (tot * 10) + (x % 10);
            x /= 10;
        }

        return tot == temp;        
    }
}