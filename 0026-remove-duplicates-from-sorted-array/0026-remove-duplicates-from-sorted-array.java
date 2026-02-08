class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int k = 1; // index of next unique position

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;


        // int l = nums.length;
        // int count = 0;
        // for(int i = 0; i < l; i++)
        // {
            // if(i == nums.length)
            // {
            //     break;
            // }

        //     for(int j = i+1; j < nums.length; j++)
        //     {
        //         if(nums[i] == nums[j])
        //         {
        //             count++;
        //         }
        //     }

        //     for(int k = i+1; k < nums.length; k++)
        //     {
        //         if(k+count < nums.length)
        //         {
        //             nums[k] = nums[k+count];
        //         }
        //     }
        //     count = 0;
        // }
        // return ;
    }
}