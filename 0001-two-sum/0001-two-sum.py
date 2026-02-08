class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        for i in range(len(nums)):
            res = target - nums[i]
            if res in nums and nums.index(res) != i:
                n1 = nums.index(res)
                n2 = i
                return [n1, n2]
            # for j in range(i+1, len(nums)):
            #     if nums[i] + nums[j] == target:
            #         print(nums[i], nums[j])
            #         return [i, j]