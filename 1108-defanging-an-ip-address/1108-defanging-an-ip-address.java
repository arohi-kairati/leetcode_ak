class Solution {
    public String defangIPaddr(String address) {
        String my_ip = "";
        for(int i = 0; i < address.length(); i++)
        {
            if(address.charAt(i) == '.')
            {
                my_ip += "[" + String.valueOf(address.charAt(i)) + "]";
            }
            else
            {
                my_ip += String.valueOf(address.charAt(i));
            }
        }
        return my_ip;
    }
}