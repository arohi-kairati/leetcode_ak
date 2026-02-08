class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        int []arr = new int[right];
        int k = 0;
        for(int i = left; i <= right; i++)
        {
            if(i == 0 || i % 10 == 0)
            {
                continue;
            }

            int n = i, rem = 0, flag = 0;
            while(n > 0)
            {
                rem = n % 10;
                if(rem == 0 || i % rem != 0)
                {
                    flag = 1;
                }
                n /= 10;
            }

            if(flag == 0)
            {
                arr[k] = i;
                k++;
            }
        }

        for(int i = 0; i < k; i++)
        {
            System.out.print(arr[i]+" ");
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < k; i++) 
        {
            list.add(arr[i]); 
        }       
        return list;
    }
}