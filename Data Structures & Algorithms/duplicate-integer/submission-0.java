class Solution {
    public boolean hasDuplicate(int[] nums) {
        //Make a set out of the array
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());

        //If the sizes are same, no duplicates!
        if(nums.length == set.size())
            return false;

        //If size of set is less, 
        //some duplicate elements must had been removed.
        return true;
    }
}