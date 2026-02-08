class Solution {
    public int maximumWealth(int[][] accounts) {
        int l = accounts.length;
        int []newl = new int[l];
        int maxwealth = 0, sum = 0;
        for(int i = 0; i < l; i++)
        {
            int len = accounts[i].length;
            for(int j = 0; j< len; j++)
            {
                sum += accounts[i][j];
            }
            if(sum > maxwealth)
            {
                maxwealth = sum;
            }
            sum = 0;
        }
        return maxwealth;
    }
}