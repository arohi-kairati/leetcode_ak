class Solution {
    public int heightChecker(int[] heights) {
        int l = heights.length;
        int []expected = new int[l];
        for(int i = 0; i < l; i++)
        {
            expected[i] = heights[i];
        }

        for(int i = 0; i < l-1; i++)
        {
            for(int j = i+1; j < l; j++)
            {
                if(expected[i] > expected[j])
                {
                    int temp = expected[i];
                    expected[i] = expected[j];
                    expected[j] = temp;
                }
            }
        }
        int count = 0;
        for(int i = 0; i < l; i++)
        {
            if(heights[i] != expected[i])
            {
                count++;
            }
        }
        return count;
    }
}