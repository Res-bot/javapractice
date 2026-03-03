public class max_subarray {

    //naive approach
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

    //Kadane's Algorithm
    public int maxSubArr2(int[] nums2){
        int sum2 = nums2[0];
        int max_sum2 = nums2[0];
        for (int i = 0; i < nums2.length; i++) {
            if(sum2>nums2[i]){
                sum2 = sum2+nums2[i];
            }else{
                sum2 = nums2[i];
            }if (sum2 > max_sum2) {
                max_sum2 = sum2;
            }
        }
        return max_sum2;
    }

    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        max_subarray marr = new max_subarray();
        System.out.println( marr.maxSubArray(arr));
        System.out.println(marr.maxSubArr2(arr));
    }
}
