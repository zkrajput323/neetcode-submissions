class Solution {
    public int[] twoSum(int[] nums, int target) {
      HashMap<Integer,Integer> map = new HashMap<>();

      for(int i = 0; i < nums.length; i++){

         int complementry = target - nums[i];

        // store the value as key and index as value
        if(map.containsKey(complementry)){

          return new int[]{map.get(complementry), i};

        }else{

        map.put(nums[i], i);
        }
        
      }
      
        return new int[]{};
    }
}
