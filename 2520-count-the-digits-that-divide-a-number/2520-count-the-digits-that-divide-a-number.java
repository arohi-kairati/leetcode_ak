class Solution {
    public int countDigits(int num) {
        int newnum = num, rem = 0, count = 0;
        while(num > 0)
        {
            rem = num % 10;
            if(newnum % rem == 0)
            {
                count++;
            }
            num /= 10;
        }
        return count;
    }
}