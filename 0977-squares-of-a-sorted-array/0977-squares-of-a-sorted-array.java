class Solution {
    public int[] sortedSquares(int[] nums) {
        int l = nums.length;

        for(int i = 0; i < l; i++)
        {
            nums[i] = nums[i] * nums[i];
            //System.out.println(nums[i]);
        }
        
        int temp = 0;
        for(int i = 0; i < l; i++)
        {
            for(int j = 0; j < l; j++)
            {
                if(nums[i] < nums[j])
                {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }
}