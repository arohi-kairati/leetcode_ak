class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int k = grid[0].length * grid.length;
        int []count = new int[2501];
        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid[i].length; j++)
            {
                count[grid[i][j]]++;
            }
        }
        System.out.println(k);
        int []arr = new int[2];
        for(int i = 0; i <= k; i++)
        {
            System.out.println(i+" "+count[i]);
            if(count[i] > 1)
            {
                arr[0] = i;
            }
            if(count[i] == 0 && i != 0)
            {
                arr[1] = i;
            }
        }
        return arr;
    }
}