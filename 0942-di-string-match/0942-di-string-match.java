class Solution {
    public int[] diStringMatch(String s) {
        int l = s.length();
        int a = 0, b = l;
        int []perm = new int[l+1];
        for(int i = 0; i < l; i++)
        {
            if(s.charAt(i) == 'I')
            {
                perm[i] = a;
                a++;
                if(i == l-1)
                {
                    perm[i+1] = a;
                }
            }
            else if(s.charAt(i) == 'D')
            {
                perm[i] = b;
                b--;
                if(i == l-1)
                {
                    perm[i+1] = b;
                }
            }
        }
        return perm;
    }
}