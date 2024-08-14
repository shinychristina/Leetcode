class Solution {
    public boolean containsDuplicate(int[] nums) {
     Set <Integer> aset=new HashSet<>();
     for(int i:nums)
     {
        if(aset.contains(i))
        {
            return true;
        }
        aset.add(i);
     }
     return false;
    }
}