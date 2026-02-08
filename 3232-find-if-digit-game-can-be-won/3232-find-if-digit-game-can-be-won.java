class Solution {
    public boolean canAliceWin(int[] nums) {
        int l = nums.length;
        //System.out.println(l);
        int sumsing = 0, sumdouble = 0;
        for(int i = 0; i < l; i++)
        {
            if(nums[i] < 10 && nums[i] > -9)
            {
                //System.out.println("single");
                sumsing += nums[i];
            }
            else
            {
                sumdouble += nums[i];
                //System.out.println("double");
            }
        }
        //System.out.println(sumsing);
        //System.out.println(sumdouble);
        if(sumsing != sumdouble)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}