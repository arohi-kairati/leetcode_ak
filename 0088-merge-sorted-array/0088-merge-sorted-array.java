class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //int l1 = nums1.length, l2 = nums2.length;
        int []me = new int[m+n];
        int i = 0, j = 0, l = 0;
        while(i < m && j < n)
        {
            if(nums1[i] <= nums2[j])
            {
                me[l] = nums1[i];
                l++;
                i++;
            }
            else
            {
                me[l] = nums2[j];
                l++;
                j++;
            }
        }

        while(i < m)
        {
            me[l] = nums1[i];
            i++;
            l++;
        }

        while(j < n)
        {
            me[l] = nums2[j];
            j++;
            l++;
        }

        for(int x = 0; x < m+n; x++)
        {
            nums1[x] = me[x];
        }

    }
}