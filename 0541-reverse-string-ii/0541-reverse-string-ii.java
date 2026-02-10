class Solution {
    public String reverseStr(String s, int k) {
        int l = s.length();
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < l; i++)
        {
            if(i+k-1 <= l-1)
            {
                for(int j = i+k-1; j >= i; j--)
                {
                    str.append(String.valueOf(s.charAt(j)));
                }
            }
            else if(i+k-1 > l-1)
            {
                for(int j = l-1; j >= i; j--)
                {
                    str.append(String.valueOf(s.charAt(j)));
                }
            }
            if(i+2*k <= l-1)
            {
                for(int j = i+k; j < i+2*k; j++)
                {
                    str.append(String.valueOf(s.charAt(j)));
                }
            }
            else if(i+2*k > l-1)
            {
                for(int j = i+k; j < l; j++)
                {
                    str.append(String.valueOf(s.charAt(j)));
                }
            }
            i = i + 2*k - 1;
        }
        return str.toString();
    }
}