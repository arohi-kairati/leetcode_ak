class Solution {
    public int calPoints(String[] operations) {
        int l = operations.length;
        int []arr = new int[l];
        int n = 0;
        for(int i = 0; i < l; i++)
        {
            if(operations[i].charAt(0) == '+' && arr.length >= 2)
            {
                arr[n] = arr[n-1] + arr[n-2];
                n++;
            }
            else if(operations[i].charAt(0) == 'D' && arr.length >= 1)
            {
                arr[n] = arr[n-1] * 2;
                n++;
            }
            else if(operations[i].charAt(0) == 'C' && arr.length >= 1)
            {
                n--;
            }
            else
            {
                arr[n] = Integer.valueOf(operations[i]);
                n++;
            }
        }

        int sum = 0;
        for(int i = 0; i < n; i++)
        {
            sum += arr[i];
        }

        return sum;
    }
}