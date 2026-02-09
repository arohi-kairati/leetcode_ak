class Solution {
    public int strStr(String haystack, String needle) {
        int hl = haystack.length(), nl = needle.length(), flag = 0;
        if(hl == nl)
        {
            for(int i = 0; i <nl; i++)
            {
                if(needle.charAt(i) != haystack.charAt(i))
                {
                    return -1;
                }
                else
                {
                    flag = 1;
                }
            }
        }
        if(flag == 1)
        {
            return 0;
        }
        for(int i = 0; i <= hl - nl; i++)
        {
            //System.out.println("kk");
            int n = 0;
            if(needle.charAt(n) == haystack.charAt(i))
            {
                if(i == hl-1 || n == nl-1)
                {
                    return i;
                }
                n++;
                //System.out.println("kk"+i);
                for(int j = i+1; j < nl+i; j++)
                {
                    //System.out.println("kk"+);
                    if(needle.charAt(n) != haystack.charAt(j))
                    {
                        System.out.println(needle.charAt(n)+" "+haystack.charAt(j));
                        flag = 0;
                        break;
                    }
                    else
                    {
                        flag = 1;
                    }
                    n++;
                }
            }
            if(flag == 1)
            {
                return i;
            }
        }
        return -1;
    }
}