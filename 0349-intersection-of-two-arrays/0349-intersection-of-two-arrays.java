class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> n1 = new HashSet<>();
        HashSet<Integer> n2 = new HashSet<>();
        for(int i = 0; i < nums1.length; i++)
        {
            if(!(n1.contains(nums1[i])))
            {
                n1.add(nums1[i]);
            }
        }
        for(int i = 0; i < nums2.length; i++)
        {
            if(!(n2.contains(nums2[i])))
            {
                n2.add(nums2[i]);
            }
        }


        // for(int val : n1)
        // {
        //     System.out.println(val);
        // }
        // for(int val : n2)
        // {
        //     System.out.println(val);
        // }





        int []arr1 = new int[n1.size()];
        int []arr2 = new int[n2.size()];

        int k = 0;
        //System.out.println("->");
        for(int val : n1)
        {
            arr1[k] = val;
            //System.out.println(arr1[k]);
            k++;
        }
        k = 0;
        //System.out.println("->");
        for(int val : n2)
        {
            arr2[k] = val;
            //System.out.println(arr2[k]);
            k++;
        }
        
        





        k = 0;
        int []arr = new int[arr1.length];
        for(int i = 0; i < arr2.length; i++)
        {
            for(int j = 0; j < arr1.length; j++)
            {
                if(arr2[i] == arr1[j])
                {
                    arr[k] = arr2[i];
                    k++;
                }
            }
        }

        int []mya = new int[k];
        for(int i = 0; i < k; i++)
        {
            mya[i] = arr[i];
            //System.out.println(arr[i]);
        }
        return mya;
    }
}