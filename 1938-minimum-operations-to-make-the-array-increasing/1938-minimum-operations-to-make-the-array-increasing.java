class Solution {
    public int minOperations(int[] nums) {
        int cnt=0,n=nums.length;
        for(int i=1;i<n;i++)
        {
            if(nums[i]<=nums[i-1])
            {
                int dif=nums[i-1]-nums[i]+1;
                nums[i]+=dif;
                cnt+=dif;
            }
        }
        return cnt;
    }
}