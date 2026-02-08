class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        int l = s.length();
        for(int i = 0; i < l; i++)
        {
            if(i+1 != l && (s.charAt(i) == 'I' && s.charAt(i+1) == 'V'))
            {
                sum += 4;
                i++;
                continue;
            }
            else if(i+1 != l && (s.charAt(i) == 'I' && s.charAt(i+1) == 'X'))
            {
                sum+= 9;
                i++;
                continue;
            }
            else if(s.charAt(i) == 'I')
            {
                sum += 1;
                continue;
            }

            if(s.charAt(i) == 'V')
            {
                sum += 5;
                continue;
            }

            if(i+1 != l && (s.charAt(i) == 'X' && s.charAt(i+1) == 'L'))
            {
                sum += 40;
                i++;
                continue;
            }
            else if(i+1 != l && (s.charAt(i) == 'X' && s.charAt(i+1) == 'C'))
            {
                sum += 90;
                i++;
                continue;
            }
            else if(s.charAt(i) == 'X')
            {
                sum += 10;
                continue;
            }

            if(s.charAt(i) == 'L')
            {
                sum += 50;
                continue;
            }

            if(i+1 != l && (s.charAt(i) == 'C' && s.charAt(i+1) == 'D'))
            {
                sum += 400;
                i++;
                continue;
            }
            else if(i+1 != l && (s.charAt(i) == 'C' && s.charAt(i+1) == 'M'))
            {
                sum += 900;
                i++;
                continue;
            }
            else if(s.charAt(i) == 'C')
            {
                sum += 100;
                continue;
            }

            if(s.charAt(i) == 'D')
            {
                sum += 500;
                continue;
            }

            if(s.charAt(i) == 'M')
            {
                sum += 1000;
                continue;
            }

            //System.out.println(sum);
        }
        return sum;
    }
}