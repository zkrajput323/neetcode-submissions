class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        #created the empty list
        indices = []
        for i in range(len(nums)):
            for j in range(i+1,len(nums)):
                #write the condition for checking  the sum is equal to target or 
                # if(j >= len(nums)):
                #     break
                
                if (nums[i] + nums[j] == target):
                    indices.append(i)
                    indices.append(j)
            # Here we don't have to use the i+=1 because for loop implicitly handle the iteration
            # i+=1
        return indices
                


