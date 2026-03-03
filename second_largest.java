class second_largest{

    public static void seclarge(int[] arr){
        int large = Integer.MIN_VALUE;
        int seclarge = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;
        int secsmall = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (large<arr[i]) {
                seclarge = large;
                large = arr[i];
            }else if(seclarge<arr[i] && seclarge != large ){
                seclarge = arr[i];
            }if(small>arr[i]){
                secsmall = small;
                small = arr[i];
            }else if(secsmall>arr[i] && secsmall != small){
                secsmall = arr[i];
            }
        }

        System.out.println("large: " + large + " and second large : " + seclarge);
        System.out.println("small: " + small + " and second small : " + secsmall);
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,8,9};
        seclarge(arr1);
    }
}


//[1,2,3,4,5,6,7]