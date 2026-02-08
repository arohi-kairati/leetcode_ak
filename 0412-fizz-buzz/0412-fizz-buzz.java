class Solution {
    public List<String> fizzBuzz(int n) {
        String []answer = new String[n];
        String ans = "";
        for(int i = 1; i <= n; i++)
        {
            if(i % 3 == 0 && i % 5 == 0)
            {
                answer[i-1] = "FizzBuzz";
            }
            else if(i % 3 == 0)
            {
                answer[i-1] = "Fizz";
            }
            else if(i % 5 == 0)
            {
                answer[i-1] = "Buzz";
            }
            else
            {
                ans = String.valueOf(i);// this function returns string type, not string array
                answer [i-1] = ans;
            }
        }
        // this is to convert the string array to string list
        List<String> mylist = Arrays.asList(answer);
        return mylist;
    }
}