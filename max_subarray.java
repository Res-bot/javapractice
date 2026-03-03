public class max_subarray {

    public int maxSubArray(int[] nums) {
        int max_sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum = sum+nums[j];
                max_sum = Math.max(max_sum, sum);
            }
        }
        return max_sum;
    }

    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        max_subarray marr = new max_subarray();
        System.out.println( marr.maxSubArray(arr));
    }
}
