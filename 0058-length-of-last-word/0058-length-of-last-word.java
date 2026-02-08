class Solution {
    public int lengthOfLastWord(String s) {
        int l = s.length();
        int lastword = 0;
        for(int i = l-1; i >= 0; i--)
        {
            if(s.charAt(i) != ' ')
            {
                lastword++;
            }

            if(s.charAt(i) == ' ' && lastword != 0)
            {
                break;
            }
        }
        return lastword;
    }
}