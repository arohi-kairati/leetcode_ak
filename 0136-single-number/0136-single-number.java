class Solution {
    public int singleNumber(int[] nums) {
        int []count = new int[600001];
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] < 0)
            {
                count[(-nums[i]) + 30000]++;
            }
            else
            {
                count[nums[i]]++;
            }
        }

        for(int i = -30000; i <= 30000; i++)
        {
            if(i < 0)
            {
                if(count[(-i) + 30000] == 1)
                {
                    return i;
                }
            }
            else
            {
                if(count[i] == 1)
                {
                    return i;
                }
            }
        }

        return 0;
    }
}