class Solution {
    static int gcd(int a, int b)
      {
        if(a==0)
            return b;
        return gcd(b%a,a);
      }
    public int minOperations(int[] nums, int[] numsDivide) {
        int t=numsDivide[0];
      for(int i=1;i<numsDivide.length;i++)
      {
        t=gcd(t,numsDivide[i]);
      }
      Arrays.sort(nums);
       for(int i=0;i<nums.length;i++)
      {
        if(t%nums[i]==0)
        {
            return i;
        }
      }
      return -1;
    }
}