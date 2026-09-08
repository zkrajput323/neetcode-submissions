import heapq
class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        
        map = dict()
        heap  = []
        result = []
        for num in nums:
            map[num] = map.get(num,0)+1

        for num, freq in map.items():
            heapq.heappush(heap,(freq,num))
            if len(heap)>k:
                heapq.heappop(heap)

        for num in heap:
            result.append(num[1])

        return result

