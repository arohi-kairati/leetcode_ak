class Solution {
    public String convertDateToBinary(String date) {
        String []arr = date.split("-");
        int []arr2 = new int[arr.length];
        for(int i = 0; i < arr.length; i++)
        {
            arr2[i] = Integer.parseInt(arr[i]);
        }
        String dabin = "";
        for(int i = 0; i < arr2.length; i++)
        {
            String str = "";
            while(arr2[i] > 0)
            {
                int rem = arr2[i] % 2;
                str += String.valueOf(rem);
                arr2[i] /= 2;
            }
            for(int j = str.length() - 1; j >= 0; j--)
            {
                dabin += str.charAt(j);
            }
            if(i != arr2.length - 1)
            {
                dabin += "-";
            }
        }
        return dabin;
    }
}