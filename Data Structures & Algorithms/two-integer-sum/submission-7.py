class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        #created the empty map
        freq = dict()
        indicies = list()

        for i,num in enumerate(nums):
            diff = target - nums[i]

            if(diff in freq):
                indicies.append(freq.get(diff))
                indicies.append(i)
                return indicies
            freq[num] = i                


