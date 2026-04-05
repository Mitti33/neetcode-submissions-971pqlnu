class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[] = null;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0;i < nums.length;i++){

            //Find difference between target and this element
            //This diff = this element's partner.
            int partner = target - nums[i];

            //Is partner already there in the map?
            //If yes, we got our answer.
            if(map.containsKey(partner)){
                ans = new int[] {map.get(partner), i};
                break;
            }

            //If partner is not present in the map,
            //maybe it lies somewhere later in the array.
            //So, map this current element with its index
            //so that, it's right here 
            //when the partner searches for its partner.
            else{
                map.put(nums[i], i);
            }
        }

        return ans;
    }
}
