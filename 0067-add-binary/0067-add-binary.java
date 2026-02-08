class Solution {
    public String addBinary(String a, String b) {
        String res = "";
        int la = a.length();
        int lb = b.length();
        int i = la-1, j = lb-1, k = 0;
        while(i >= 0 && j >= 0)
        {
            if((a.charAt(i) == '0' && b.charAt(j) == '1') || (a.charAt(i) == '1' && b.charAt(j) == '0'))
            {
                if(k == 1)
                {
                    res += "0";
                    k = 1;
                }
                else
                {
                    res += "1";
                    k = 0;
                }
            }
            else if(a.charAt(i) == '1' && b.charAt(j) == '1')
            {
                if(k == 1)
                {
                    res += "1";
                    k = 1;
                }
                else
                {
                    res += "0";
                    k = 1;
                }
            }
            else if(a.charAt(i) == '0' && b.charAt(j) == '0')
            {
                if(k == 1)
                {
                    res += "1";
                    k = 0;
                }
                else
                {
                    res += "0";
                    k = 0;
                }
            }
            i--;
            j--;
        }

        if(la == lb && k == 1)
        {
            res += String.valueOf(k);
            k = 0;
        }

        while(i >= 0)
        {
            if(k == 1)
            {
                if(a.charAt(i) == '1')
                {
                    res += "0";
                    k = 1;
                }
                else
                {
                    res += "1";
                    k = 0;
                }
            }
            else
            {
                res += String.valueOf(a.charAt(i));
            }
            i--;
        }
        

        while(j >= 0)
        {
            if(k == 1)
            {
                if(b.charAt(j) == '1')
                {
                    res += "0";
                    k = 1;
                }
                else
                {
                    res += "1";
                    k = 0;
                }
            }
            else
            {
                res += String.valueOf(b.charAt(j));
            }
            j--;
        }

        if(k == 1)
        {
            res += "1";
        }

        //reversing for correct answer
        String r = "";
        for(int x = res.length()-1; x >= 0; x--)
        {
            r += String.valueOf(res.charAt(x));
        }
        return r;
    }
}