class Solution {
    public String firstPalindrome(String[] words) {
        int count = 0;
        for(String s : words)
        {
            boolean ok = true;
            int l = s.length();
            for(int i = 0; i < l/2; i++)
            {
                if(s.charAt(i) != s.charAt(l- 1 - i))
                {
                    ok = false;
                    break;
                }
            }
            if(ok)
            {
                return s;
            }
            count = 0;
        }
        return "";
    }
}