class Solution {
    public int thirdMax(int[] nums) {
        int l = nums.length;
        for(int i = 0; i < l; i++)
        {
            for(int j = i+1; j < l; j++)
            {
                if(nums[i] < nums[j])
                {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        for(int i = 0; i < l; i++)
        {
            System.out.print(nums[i]);
        }
        System.out.println();

        int []arr = new int[l];
        arr[0] = nums[0];
        int n = 1, flag = 0;
        for(int i = 1; i < l; i++)
        {
            for(int j = i-1; j >= 0; j--)
            {
                if(nums[i] == nums[j])
                {
                    flag = 1;
                }
            }
            if(flag == 0)
            {
                arr[n] = nums[i];
                n++;
            }
            flag = 0;
        }

        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i]);
        }

        if(n == 2 || n == 1)
        {
            return arr[0];
        }
        return arr[2];
    }
}