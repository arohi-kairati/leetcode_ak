class Solution {
    public int gcdOfOddEvenSums(int n) {
        int odds = 0, evens = 0;
        
        for(int i = 2; i <= 2*n; i = i+2)
        {
            evens += i;
        }
        for(int i = 1; i <= 2*n; i = i+2)
        {
            odds += i;
        }
        System.out.println(evens);
        System.out.println(odds);
        int gcd = 0;
        for(int i = 1; i <= evens/2; i++)
        {
            if(evens % i == 0 && odds % i == 0)
            {
                gcd = i;
            }
        }
        return gcd;
    }
}