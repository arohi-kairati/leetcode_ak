class Solution {
    public boolean squareIsWhite(String coordinates) {
        int f = coordinates.charAt(0);
        int s = coordinates.charAt(1);
        System.out.println(f+"  "+s);
        if((f % 2 == 0 && s % 2 != 0) || (f % 2 != 0 && s % 2 == 0))
        {
            return true;
        }
        return false;
    }
}