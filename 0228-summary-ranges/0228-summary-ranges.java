class Solution {
    public List<String> summaryRanges(int[] nums) {
        int l = nums.length, n = 0;
        List<String> str = new ArrayList<>();
        String s = "";
        for(int i = 0; i < l; i++)
        {
            s += String.valueOf(nums[i]);
            for(int j = i; j < l; j++)
            {
                if(j == l-1)
                {
                    if(i == j)
                    {
                        str.add(s);
                        System.out.println(str);
                    }
                    if(i != j)
                    {
                        s += "->" + String.valueOf(nums[j]);
                        str.add(s);
                        //System.out.println(str);
                    }
                    s = "";
                    i = j;
                    break;
                }

                if(nums[j+1] == nums[j] + 1)
                {
                    continue;
                }
                else if(nums[j+1] > nums[j] + 1)
                {
                    if(i != j)
                    {
                        s += "->" + String.valueOf(nums[j]);
                        //System.out.println(s);
                        str.add(s);
                        //System.out.println(str);
                    }
                    if(i == j)
                    {
                        str.add(s);
                        //System.out.println(str);
                    }
                    s = "";
                    i = j;
                    break;
                }
                //System.out.println(i+" "+j);
            }
        }
        return str;
    }
}