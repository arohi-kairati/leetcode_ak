import java.math.BigInteger;
class Solution {
    public int findComplement(int num) {
        StringBuilder str = new StringBuilder();
        while(num > 0)
        {
            str.append(num%2);
            num /= 2;
        }

        String s = str.toString();
        StringBuilder str2 = new StringBuilder();
        for(int i = s.length()-1; i >= 0; i--)
        {
            str2.append(s.charAt(i));
        }


        String k = str2.toString();
        StringBuilder newstr = new StringBuilder();
        for(int i= 0; i < s.length(); i++)
        {
            if(k.charAt(i) == '1')
            {
                newstr.append("0");
            }
            else
            {
                newstr.append("1");
            }
        }
        BigInteger newnum = new BigInteger(newstr.toString());
        int mynum = 0, n = 0;
        while (newnum.compareTo(BigInteger.ZERO) > 0) 
        {
            BigInteger rem = newnum.mod(BigInteger.TEN);
            mynum += rem.intValue() * Math.pow(2, n);
            n++;
            newnum = newnum.divide(BigInteger.TEN);
        }
        return mynum;
    }
}