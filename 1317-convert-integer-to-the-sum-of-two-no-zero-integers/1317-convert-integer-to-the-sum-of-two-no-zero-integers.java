class Solution {
    public int[] getNoZeroIntegers(int n) {
        int []arr = new int[2];
        for(int i = 1; i < n; i++)
        {
            int j = n - i;
            int k1 = i, k2 = j;
            int flag1 = 0, flag2 = 0;
            //System.out.print(k1+" "+k2+"    ");
            while(k1 > 0)
            {
                if(k1 % 10 == 0)
                {
                    flag1 = 1;
                }
                k1 /= 10;
            }
            while(k2 > 0)
            {
                if(k2 % 10 == 0)
                {
                    flag2 = 1;
                }
                k2 /= 10;
            }
            System.out.print(flag1+" "+flag2+"    ");
            if(flag1 == 1 || flag2 == 1)
            {
                continue;
            }
            else
            {
                arr[0] = i;
                arr[1] = j;
                break;
            }
        }
        return arr;
    }
}