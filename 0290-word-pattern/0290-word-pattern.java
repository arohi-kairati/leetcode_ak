class Solution {
    public boolean wordPattern(String pattern, String s) {
        String []str = s.split(" ");
        String []count = new String[300];
        int k = 0;
        if(pattern.length() != str.length)
        {
            return false;
        }
        
        for(int i = 0; i < pattern.length(); i++)
        {
            if(count[pattern.charAt(i) - 97] == null)
            {
                k++;
            }
            count[pattern.charAt(i) - 97] = str[i];
            //System.out.println(count[pattern.charAt(i) - 97]);
        }
        System.out.println(k);

        int c = 0;
        for(int i = 0; i < str.length; i++)
        {
            for(int j = 0; j < k; j++)
            {
                System.out.println("-->"+count[j]+" "+str[i]);
                if(str[i].equals(count[j]))
                {
                    c++;
                }
            }
            if(c > 1)
            {
                return false;
            }
            c = 0;
        }

        for(int i = 0; i < str.length; i++)
        {
            System.out.print(count[pattern.charAt(i) - 97]+"   ");
            System.out.println(str[i]);
            System.out.println(pattern.charAt(i));
            if(!(str[i].equals(count[pattern.charAt(i) - 97])))
            {
                return false;
            }
        }
        return true;
    }
}