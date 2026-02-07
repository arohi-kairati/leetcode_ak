class Solution {
    public int differenceOfSum(int[] nums) {
        int elsum = 0, digsum = 0, rem = 0;
        for(int n : nums)
        {
            elsum += n;
            if(n >= 10)
            {
                while(n > 0)
                {
                    rem = n%10;
                    digsum += rem;
                    n /= 10;                
                }
            }
            else
            {
                digsum += n;
            }
        }
        if(elsum > digsum)
        {
            return elsum - digsum;
        }
        else
        {
            return digsum - elsum;
        }
    }
}