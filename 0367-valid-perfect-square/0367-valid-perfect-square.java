class Solution {
    public boolean isPerfectSquare(int num) {
        if(num == 1)
        {
            return true;
        }
        for(long i = 0; i <= Math.sqrt(num); i++)
        {
            if(i*i == num)
            {
                System.out.println(i);
                return true;
            }
        }

        return false;
    }
}