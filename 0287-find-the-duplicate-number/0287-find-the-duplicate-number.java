class Solution {
    public int findDuplicate(int[] nums) {
        //int count=0;
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++)
        {
                if(nums[i]==nums[i+1])
                    return nums[i];
        }
       return -1;
         }
}