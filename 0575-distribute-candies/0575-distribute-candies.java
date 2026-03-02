class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> myset = new HashSet<>();
        for(int val : candyType)
        {
            if(!(myset.contains(val)))
            {
                myset.add(val);
            }
        }
        int h = candyType.length / 2;
        if(myset.size() > h)
        {
            return h;
        }
        return myset.size();
    }
}