class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        //Calculate prefix product for every ele
        int output[] = new int[n];
        output[0] = 1;
        for(int i = 1;i < n;i++)
            output[i] = output[i - 1] * nums[i - 1];
        
        //Calculate suffix product for every ele
        //and calculate its final product simultaneously!
        //Final product = prefix product * suffix product
        int suffix = 1;
        for(int i = n - 1;i >= 0;i--){
            output[i] *= suffix;
            suffix *= nums[i];
        }
        
        return output;
    }
}  
