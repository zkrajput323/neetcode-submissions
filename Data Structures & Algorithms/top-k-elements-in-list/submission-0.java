class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         HashMap<Integer,Integer> freq = new HashMap<>();

        for(int num: nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }

        Queue<Integer> minHeap = new PriorityQueue<>(
            (a,b) -> freq.get(a) - freq.get(b)
        );

        for(int i: freq.keySet()){

            minHeap.add(i);
            if(minHeap.size()>k){
                minHeap.poll();
            }

        }

       // List<Integer> topElement = new ArrayList<>();
        int[] topElement = new int[k];

        for(int i= 0; i < k; i++){
            topElement[i]= minHeap.poll();
           
        }

        
        return topElement;
        
    }
}
