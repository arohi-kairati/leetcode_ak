class Solution {
    public String largestOddNumber(String num) {
        int l = num.length(), ind = -1;
        String larg = "1";
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < l; i++)
        {
            if(Character.getNumericValue(num.charAt(i)) % 2 == 1)
            {
                //larg = String.valueOf(num.charAt(i));
                ind = i;
            }
        }
        for(int i = 0; i <= ind; i++)
        {
            str.append(num.charAt(i));
        }
        return str.toString();
    }
}