class Solution {
    public boolean isPalindrome(String s) {
        int l = s.length();
        String str = "";
        for(int i = 0; i < l; i++)
        {
            // if(s.charAt(i) != ' ' && s.charAt(i) != ',' && s.charAt(i) != '.' && s.charAt(i) != '!' && s.charAt(i) != '?' && s.charAt(i) != ':' && s.charAt(i) != ';' && s.charAt(i) != '/' && s.charAt(i) != '~' && s.charAt(i) != '@' && s.charAt(i) != '#' && s.charAt(i) != '$' && s.charAt(i) != '%' && s.charAt(i) != '^' && s.charAt(i) != '&' && s.charAt(i) != '*' && s.charAt(i) != '(' && s.charAt(i) != ')' && s.charAt(i) != '_' && s.charAt(i) != '+' && s.charAt(i) != '{' && s.charAt(i) != '}' && s.charAt(i) != '[' && s.charAt(i) != ']' && s.charAt(i) != '"' && s.charAt(i) != '\'' && s.charAt(i) != '<' && s.charAt(i) != '>' && s.charAt(i) != '-' && s.charAt(i) != '\\' && s.charAt(i) != '`')
            if(Character.isLetterOrDigit(s.charAt(i)))
            {
                if(s.charAt(i) >= 65 && s.charAt(i) <= 90)
                {
                    String k = String.valueOf((char)(s.charAt(i) + 32));
                    str += k;
                }
                else
                {
                    String k = String.valueOf(s.charAt(i));
                    str += k;
                }
            }
        }
        if(str.isEmpty())
        {
            return true;
        }

        int lstr = str.length();
        String rev = "";
        for(int i = lstr-1; i >= 0; i--)
        {
            String k = String.valueOf(str.charAt(i));
            rev += k;
        }

        System.out.println(str);
        System.out.println(rev);

        if(str.equals(rev))
        {
            return true;
        }
        return false;
    }
}