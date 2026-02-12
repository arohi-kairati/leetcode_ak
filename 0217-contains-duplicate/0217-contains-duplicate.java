class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> myset = new HashSet<>();
        for(int i = 0; i < nums.length; i++)
        {
            if(myset.contains(nums[i]))
            {
                return true;
            }
            myset.add(nums[i]);
        }
        return false;
    }
}