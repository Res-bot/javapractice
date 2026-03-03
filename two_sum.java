public class two_sum {
    public static void find_sum(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(target + " is the sum of elements at " + i + " index and " + j + " index");
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {8,7,9,2,3,5,6};
        find_sum(arr, 17);
    }
}
