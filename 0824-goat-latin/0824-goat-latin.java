class Solution {
    public String toGoatLatin(String sentence) {
        //int k = sentence.length();
        String[] words = sentence.split(" ");
        int l = words.length;
        int n = 1;
        String []str = new String[l];
        for(int j = 0 ; j < l; j++)
        {
            String w = words[j];
            if(w.charAt(0) == 'a'|| w.charAt(0) == 'e'|| w.charAt(0) == 'i'|| w.charAt(0) == 'o'|| w.charAt(0) == 'u'|| w.charAt(0) == 'A'|| w.charAt(0) == 'E'|| w.charAt(0) == 'I'|| w.charAt(0) == 'O'|| w.charAt(0) == 'U')
            {
                str[j] = w + "ma" + "a".repeat(n);
                n++;
            }
            else
            {
                String s = "";
                for(int i = 1; i < w.length(); i++)
                {
                    s += String.valueOf(w.charAt(i));
                }
                s += w.charAt(0) + "ma" + "a".repeat(n);
                n++;
                str[j] = s;
            }
        }
        String newsent = String.join(" ", str);
        return newsent;
    }
}