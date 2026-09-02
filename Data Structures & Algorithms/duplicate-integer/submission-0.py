class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:

        # create the empty dictonary
        freq = dict()
        for i, num in enumerate(nums):
            if num in freq:
                return True
            freq[num] = freq.get(num,0)+1

        return False