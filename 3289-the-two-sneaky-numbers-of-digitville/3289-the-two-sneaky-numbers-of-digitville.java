class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int n = nums.length;
        int []count = new int[n];
        int []arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            count[nums[i]]++;
        }
        int k = 0;
        for(int i = 0; i < n; i++)
        {
            if(count[i] > 1)
            {
                arr[k] = i;
                k++;
            }
        }
        int []arr1 = new int[k];
        for(int i = 0; i < k; i++)
        {
            arr1[i] = arr[i];
        }
        return arr1;
    }
}