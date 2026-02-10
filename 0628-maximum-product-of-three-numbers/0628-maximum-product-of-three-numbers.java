class Solution {
    public int maximumProduct(int[] nums) {
        int l = nums.length, prod1 = 1, prod2 = 1, negcount = 0, poscount = 0, zeros = 0;
        if(l <= 3)
        {
            return nums[0]*nums[1]*nums[2];
        }

        //sorting
        for(int i = 0; i < l; i++)
        {
            for(int j = i+1; j < l; j++)
            {
                if(nums[i] > nums[j])
                {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        for(int i = 0; i < l; i++)
        {
            System.out.println(nums[i]);
        }

        //counting pos/neg
        for(int i = 0; i < l; i++)
        {
            if(nums[i] < 0)
            {
                negcount++;
            }
            else if(nums[i] > 0)
            {
                poscount++;
            }
            else
            {
                zeros++;
            }
        }    
        System.out.println("l"+poscount);
        System.out.println(negcount);
        System.out.println(zeros);

        if(zeros == l)
        {
            return 0;
        }    

        if(negcount >= 2 && poscount >= 3)
        {
            prod1 = nums[0] * nums[1] * nums[l-1];
            prod2 = nums[l-1] * nums[l-2] * nums[l-3];
            return Math.max(prod1, prod2);
        }
        else if(negcount >= 2 && (poscount > 0 && poscount < 3))
        {
            prod1 = nums[0] * nums[1] * nums[l-1];
            return prod1;
        }
        else if(poscount >= 3 && (negcount > 0 && negcount < 2) && zeros == 0)
        {
            prod2 = nums[l-1] * nums[l-2] * nums[l-3];
            return prod2;
        }
        // else if(poscount >= 3 && (negcount > 0 && negcount < 2) && zeros != 0)
        if(negcount == 0)
        {
            prod2 = nums[l-1] * nums[l-2] * nums[l-3];
            return prod2;
        }
        if(poscount == 0 && zeros != 0)
        {
            prod1 = 0;
            return prod1;
        }
        else if(poscount == 0 && zeros == 0)
        {
            return nums[l-1] * nums[l-2] * nums[l-3];
        }

        if(poscount == 2 && negcount == 1)
        {
            for(int i = 0; i < l; i++)
            {
                if(nums[i] >= 0)
                {
                    prod1 *= nums[i];
                }
            }
            return prod1;
        }
        if(poscount == 1 && negcount == 2)
        {
            for(int i = 0; i < l; i++)
            {
                if(nums[i] != 0)
                {
                    prod1 *= nums[i];
                }
            }
            return prod1;
        }
        return prod1;
    }
}