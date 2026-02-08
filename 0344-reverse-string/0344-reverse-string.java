class Solution {
    public void reverseString(char[] s) {
        char ch;
        int l = s.length;
        for(int i = 0; i < l/2; i++)
        {
            ch = s[i];
            s[i] = s[l-1-i];
            s[l-1-i] = ch;
        }

        return;
    }
}