class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        int l = moves.length();
        for(int i = 0; i < l; i++)
        {
            if(moves.charAt(i) == 'R')
            {
                x++;
            }
            if(moves.charAt(i) == 'L')
            {
                x--;
            }
            if(moves.charAt(i) == 'U')
            {
                y++;
            }
            if(moves.charAt(i) == 'D')
            {
                y--;
            }
        }

        if(x == 0 && y == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}