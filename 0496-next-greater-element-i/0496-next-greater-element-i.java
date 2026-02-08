class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int l1 = nums1.length, l2 = nums2.length;
        int []arr = new int[l1];
        for(int i = 0; i < l1; i++)
        {
            arr[i] = -1;
            for(int j = 0; i < l2; j++)
            {
                if(nums1[i] == nums2[j])
                {
                    if(j == l2-1)
                    {
                        break;
                    }
                    for(int k = j+1; k < l2; k++)
                    {
                        if(nums2[k] > nums1[i])
                        {
                            arr[i] = nums2[k];
                            break;
                        }
                    }
                    break;
                }
            }
        }
        return arr;
    }
}