class Solution {
    public int[] productExceptSelf(int[] nums) {

        int prod=1;
        boolean isZero=false;
        int moreThanOneZero=0;

        for(int n: nums){
            if(n!=0){
                prod*=n;
            }
            else{
                moreThanOneZero++;
                isZero=true;
            }
        }

        int[] ans= new int[nums.length];

        if(moreThanOneZero>1)
        return ans;

        for(int i=0;i<nums.length;i++){
            if(isZero && nums[i]!=0)
            ans[i]=0;
            else if(nums[i]==0)
            ans[i]=prod;
            else
            ans[i]=prod/nums[i];
        }

        return ans;
        
    }
}  
