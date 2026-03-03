class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int l1 = nums1.length, l2 = nums2.length;
        if(nums1[0] > nums2[l2-1] || nums2[0] > nums1[l1-1])
        {
            return -1;
        }
        for(int i = 0; i < nums1.length; i++)
        {
            for(int j = 0; j < nums2.length; j++)
            {
                if(nums1[i] == nums2[j])
                {
                    return nums1[i];
                }
            }
        }
        return -1;
    }
}