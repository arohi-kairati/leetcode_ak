class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x < 0:
            return False
        if x < 10:
            return True
        rev, k = 0, x
        while(k > 0):
            rem = k%10
            rev = rev*10 + rem
            k //= 10
        print(rev)
        return x == rev