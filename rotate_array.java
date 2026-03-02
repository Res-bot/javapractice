class rotate_array{
    public static void reverse(int[] arr, int start, int end){
        while (start<end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void rot_arr(int[] arr, int k){
        int n = arr.length;
        k %= n;

        reverse(arr, 0, n-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
    }

    public static void main(String[] args) {
        int[] arr = {6,7,8,9,3,4};
        rot_arr(arr, 3);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}


//[1,2,3,4,5] -> [2,3,4,5,1] -> [3,4,5,1,2] -> [4,5,1,2,3] -> [5,1,2,3,4] -> [1,2,3,4,5]
