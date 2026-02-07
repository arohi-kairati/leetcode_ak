class Solution {
    public String toLowerCase(String s) {
        int l = s.length();
        char []arr = s.toCharArray();
        for(int i = 0; i < l; i++)
        {
            if(arr[i] >= 65 && arr[i] <= 90)
            {
                arr[i] = (char)(arr[i] + 32);
            }
        }
        return new String(arr);
    }
}