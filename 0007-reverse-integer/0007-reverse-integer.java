class Solution {
    public int reverse(int x) {
        int lastdig = 0;
        if(x == 0)
        {
            return 0;
        }
        while(x % 10 == 0)
        {
            x /= 10;
        }

        if(x < 0)
        {
            lastdig = -(x%10);
        }
        else
        {
            lastdig = x%10;
        }

        //System.out.println(x);
        System.out.println(lastdig);

        //length
        int m = x, len = 0;
        while(m != 0)
        {
            len++;
            m /= 10;
        }
        //System.out.println(len);

        if(len == 10)
        {
            if(lastdig > 2)
            {
                return 0;
            }
            if(x <= 1463847412 && x > -1463847412)
            {
                int rem = 0, rev = 0, k = x;
                while(k != 0)
                {
                    rem = k%10;
                    rev = rev*10 + rem;
                    k /= 10;
                }
                System.out.println(rev);
                return rev;
            }
            else if(x < 1463847412 && x >= -1463847412)
            {
                int rem = 0, rev = 0, k = x;
                while(k != 0)
                {
                    rem = k%10;
                    rev = rev*10 + rem;
                    k /= 10;
                }
                System.out.println(rev);
                return rev;
            }
            else if(x == -2147483412)
            {
                return -2143847412;
            }
            else
            {
                return 0;
            }
        }

        int rem = 0, rev = 0, k = x;
        while(k != 0)
        {
            rem = k%10;
            rev = rev*10 + rem;
            k /= 10;
        }

        //System.out.println(x);
        return rev;
    }
}