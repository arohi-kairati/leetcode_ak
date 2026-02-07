class Solution {
    public int countKeyChanges(String s) {
        int l = s.length();
        int count = 0;
        for(int i = 0; i < l-1; i++)
        {
            if(s.charAt(i) != s.charAt(i+1) && s.charAt(i+1) != s.charAt(i)+32 && s.charAt(i+1) != s.charAt(i) - 32)
            {
                count++;
            }
        }
        return count;
    }
}