class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        l1 = len(nums)
        myset = set(nums)
        l2 = len(myset)
        return l1 > l2