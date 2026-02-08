class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        String[] str = new String[n]; // stack
        int k = 0;                    // stack pointer

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            // opening brackets → push
            if (c == '(' || c == '{' || c == '[') {
                str[k] = String.valueOf(c);
                k++;
            }
            // closing brackets → pop & check
            else {
                if (k == 0) return false; // nothing to match

                String top = str[k - 1];

                if ((c == ')' && top.equals("(")) || (c == '}' && top.equals("{")) || (c == ']' && top.equals("["))) {
                    k--;
                } else {
                    return false;
                }
            }
        }
        return k == 0;
    }
}
