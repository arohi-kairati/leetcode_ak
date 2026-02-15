class Solution {
    public int[] constructRectangle(int area) {
        int []arr = new int[2];
        int min = area, j = 0;
        for(int i = (int)Math.sqrt(area); i >= 1; i--)
        {
            if(area % i == 0)
            {
                j = area / i;
                // if(j-i < min)
                // {
                //     min = j-i;
                    arr[0] = j;
                    arr[1] = i;
                    break;
                //}
            }
        }
        return arr;
    }
}