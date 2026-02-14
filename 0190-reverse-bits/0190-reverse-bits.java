class Solution {
    public int reverseBits(int n) {
        StringBuilder str = new StringBuilder();
        int k = n;
        while(k > 0)
        {
            if(k % 2 == 0)
            {
                str.append("0");
            }
            else
            {
                str.append("1");
            }
            k /= 2;
        }
        String s = str.toString();


        System.out.println("s  "+s);


        int l = s.length();
        int rem = 32 - l;
        StringBuilder str2 = new StringBuilder();
        str2.append(s);
        str2.append("0".repeat(rem));
        String s1 = str2.toString();


        System.out.println("str2  "+str2);


        int p = 0, sum = 0, c = 0;
        for(int i = s1.length() - 1; i >= 0; i--)
        {
            p = Character.getNumericValue(s1.charAt(i)) * (int)Math.pow(2, c);
            c++;
            sum += p;
        }
        return sum;
    }
}