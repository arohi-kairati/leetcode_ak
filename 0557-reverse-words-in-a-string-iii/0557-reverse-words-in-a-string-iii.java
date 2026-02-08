class Solution {
    public String reverseWords(String s) {
        int l = s.length(), n = 0;
        String new_s = "", str = "";
        for(int i = 0; i < l; i++)
        {
            if(i != l-1 && s.charAt(i) != ' ')
            {
                str += s.charAt(i);
                n++;
            }
            else
            {
                if(i == l-1)
                {
                    new_s += String.valueOf(s.charAt(i));
                }
                for(int j = n-1; j >= 0; j--)
                {
                    String k = String.valueOf(str.charAt(j));
                    new_s += k;
                }
                if(s.charAt(i) == ' ')
                {
                    new_s += " ";
                }
                n = 0;
                str = "";
            }
        }
        return new_s;
    }
}