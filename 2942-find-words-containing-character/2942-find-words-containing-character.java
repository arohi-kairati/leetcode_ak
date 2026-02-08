import java.util.stream.*;
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> mylist = new ArrayList<>();
        int lwords = words.length;
        int []arr = new int[lwords];
        int n = 0;
        for(int j = 0; j < lwords; j++)
        {
            int l = words[j].length();
            for(int i = 0; i < l; i++)
            {
                if(words[j].charAt(i) == x)
                {
                    arr[n] = j;
                    n++;
                    break;
                }
            }
        }
        for(int i = 0; i < n; i++)
        {
            mylist.add(arr[i]);
        }
        return mylist;
    }
}