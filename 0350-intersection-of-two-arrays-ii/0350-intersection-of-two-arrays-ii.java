class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int []count1 = new int[1001];
        int []count2 = new int[1001];
        int l1 = nums1.length, l2 = nums2.length;
        for(int i = 0; i < l1; i++)
        {
            count1[nums1[i]]++;
        }
        for(int i = 0; i < l2; i++)
        {
            count2[nums2[i]]++;
        }
        int k = 0;
        int []arr = new int[1001];
        for(int i = 0; i <= 1000; i++)
        {
            //System.out.println(count1[i]);
            //System.out.println(count2[i]);
            int max = 0;
            if(count1[i] != 0 && count2[i] != 0 && (count1[i] >= count2[i] || count1[i] <= count2[i]))
            {
                if(count1[i] > count2[i])
                {
                    max = count2[i];
                }
                else
                {
                    max = count1[i];
                }
                for(int j = 0; j < max; j++)
                {
                    arr[k] = i;
                    //System.out.println("uuuu");
                    k++;
                }
            }
        }
        int []a = new int[k];
        for(int i = 0; i < k; i++)
        {
            a[i] = arr[i];
            //System.out.println(arr[i]);
        }
        return a;
    }
}