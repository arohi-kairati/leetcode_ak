class Solution {
    public boolean hasAlternatingBits(int n) {
        int k = n;
        StringBuilder str = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        while(k > 0)
        {
            if(k % 2 == 0)
            {
                str.append("0");
            }
            else
            {
                str.append("1");
            }
            k /= 2;
        }
        String s = str.toString();
        for(int i = s.length()- 1; i >= 0; i--)
        {
            str2.append(s.charAt(i));
        }
        String m = str2.toString();
        int c1 = 0, c2 = 0;
        for(int i = 0; i < m.length(); i++)
        {
            if(i % 2 == 0)
            {
                if(m.charAt(i) == '1')
                {
                    c1++;
                }
            }
            else
            {
                if(m.charAt(i) == '0')
                {
                    c2++;
                }
            }
        }
        return c1+c2 == m.length();
    }
}