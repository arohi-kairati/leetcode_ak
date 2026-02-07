class Solution {
    public int findNumbers(int[] nums) {
        int len = nums.length;
        int count = 0, occ = 0;
        for(int i = 0; i < len; i++)
        {
            while(nums[i] > 0)
            {
                count++;
                nums[i] /= 10;
            }
            if(count %2 == 0)
            {
                occ++;
            }
            count = 0;
        }
        return occ;
    }
}