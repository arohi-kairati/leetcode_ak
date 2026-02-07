class Solution {
    public int mostWordsFound(String[] sentences) {
        int l = sentences.length;
        int max = 0;
        int num_of_wrds = 1;
        for(String s : sentences)
        {
            for(char ch : s.toCharArray())
            {
                if(ch == ' ')
                {
                    num_of_wrds += 1;
                    //System.out.println("no. of words "+ num_of_wrds);
                }
            }
            if(num_of_wrds > max)
            {
                max = num_of_wrds;
            }
            num_of_wrds = 1;
        }
        return max;
    }
}