class Solution {
    public String longestCommonPrefix(String[] strs) {
        int small = 200, flag = 0;
        String same_prefix = "";
        for(String s : strs)
        {
            if(s.length() < small)
            {
                small = s.length();
            }
        }

        for(int i = 0; i < small; i++)
        {
            for(int j = 1; j < strs.length; j++)
            {
                if(strs[j].charAt(i) != strs[0].charAt(i))
                {
                    flag = 1;
                    break;
                }
            }
            if(flag == 0)
            {
                same_prefix += strs[0].charAt(i);
            }
            else
            {
                break;
            }
        }
        return same_prefix;
    }
}