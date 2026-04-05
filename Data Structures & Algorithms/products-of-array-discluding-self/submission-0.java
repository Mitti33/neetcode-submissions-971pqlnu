class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1, zeros = 0, output[] = new int[nums.length];
        for(int i : nums){
            if(i == 0)
                zeros++;
            else
                product *= i;
        }
        for(int i = 0;i < nums.length;i++){
            if(zeros == 1 && nums[i] == 0){
                Arrays.fill(output, 0);
                output[i] = product;
                break;
            }
            else if(nums[i] == 0){
                Arrays.fill(output, 0);
                break;
            }
            else if(zeros == 0)
                output[i] = product / nums[i];
        }
        return output;
    }
}  
