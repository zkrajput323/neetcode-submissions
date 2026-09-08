import heapq
class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        freq_map = dict()
        heap = []
        result = []
        for num in nums:
            freq_map[num] = freq_map.get(num,0)+1
        
        for freq, num in freq_map.items():

            heapq.heappush(heap,(num,freq))
            if(len(heap)>k):
                heapq.heappop(heap)
            
        print(heap)
        for pair in heap:
            result.append(pair[1])

        return result

                
