class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int l = nums.length;
        int count = 0;
        int []arr = new int[l];
        for(int i = 0; i < l; i++)
        {
            for(int j = 0; j < l; j++)
            {
                if(i != j)
                {
                    if(nums[i] > nums[j])
                    {
                        count++;
                    }
                }
            }
            arr[i] = count;
            count = 0;
        }
        return arr;
    }
}