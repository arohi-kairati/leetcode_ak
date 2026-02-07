class Solution {
    static int addDig(int num)
    {
        int sum = 0, rem = 0;
        while(num > 0)
        {
            rem = num%10;
            sum += rem;
            num /= 10;
        }
        return sum;
    }

    public int addDigits(int num) {
        int k = num, c = 0;
        while(true)
        {
            while(k > 0)
            {
                c++;
                k /= 10;
            }
            if(c > 1)
            {
                k = addDig(num);
                num = k;
            }
            else
            {
                break;
            }
            c = 0;
        }
        return num;
    }
}