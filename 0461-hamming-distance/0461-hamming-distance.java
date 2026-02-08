class Solution {
    public int hammingDistance(int x, int y) {
        int exor = x^y;
        System.out.println(exor);
        int e = exor;
        if(exor == 0)
        {
            return 0;
        }

        //exor value to binary
        int rem = 0, count = 0;
        String bin = "";
        while(e>0)
        {
            rem = e%2;
            bin = bin + rem;
            e /= 2;
        }
        for(int i = 0; i < bin.length(); i++)
        {
            if(bin.charAt(i) == '1')
            {
                count++;
            }
        }
        return count;
    }
}