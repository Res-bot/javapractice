class second_largest{

    public static void seclarge(int[] arr){
        int small = Integer.MAX_VALUE;
        int scndsmall = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        int scndlrg = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(large < arr[i]){
                scndlrg = large;
                large = arr[i];   
            }else if(scndlrg<arr[i] && scndlrg != large){
                scndlrg = arr[i];
            }
            if(small > arr[i]){
                scndsmall = small;
                small = arr[i];
            }else if(scndsmall>arr[i] && scndsmall != small){
                scndsmall = arr[i];
            }
        }

        System.out.println("Largest: " + large + " , Second Largest : " + scndlrg);
        System.out.println("Smallest: " + small + " , Second smallest : " + scndsmall);
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,8,9};
        seclarge(arr1);
    }
}


//[1,2,3,4,5,6,7]