class Solution {
    public String addStrings(String num1, String num2) {
        int l1 = num1.length(), l2 = num2.length();
        int k = 0, i = l1 - 1, j = l2 - 1;
        int a = 0, b = 0;
        String add = "", sum = "";
        while(i >= 0 && j >= 0)
        {
            a = Character.getNumericValue(num1.charAt(i));
            b = Character.getNumericValue(num2.charAt(j));
            add = String.valueOf(a+b+k);
            if(a+b+k >= 10)
            {
                sum += String.valueOf(add.charAt(1));
                k = Character.getNumericValue(add.charAt(0));
            }
            else
            {
                sum += add;
                k = 0;
            }
            i--;
            j--;
        }

        while(i >= 0)
        {
            a = Character.getNumericValue(num1.charAt(i));
            add = String.valueOf(a+k);
            if(a+k >= 10)
            {
                sum += String.valueOf(add.charAt(1));
                k = Character.getNumericValue(add.charAt(0));
            }
            else
            {
                sum += add;
                k = 0;
            }
            i--;
        }

        while(j >= 0)
        {
            b = Character.getNumericValue(num2.charAt(j));
            add = String.valueOf(b+k);
            if(b+k >= 10)
            {
                sum += String.valueOf(add.charAt(1));
                k = Character.getNumericValue(add.charAt(0));
            }
            else
            {
                sum += add;
                k = 0;
            }
            j--;
        }

        if(k == 1)
        {
            sum += String.valueOf(k);
            k = 0;
        }

        //reversing
        String news = "";
        for(int w = sum.length()-1; w >= 0; w--)
        {
            news += String.valueOf(sum.charAt(w));
        }
        return news;
    }
}