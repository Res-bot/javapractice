public class MoveZeroes {

    //KADANE'S ALGORITHM

    public int kadane(int[] arr){
        int max_sum = arr[0];
        int sum = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(sum>arr[i]){
                sum = sum + arr[i];
            }else{
                sum = arr[i];
            }if(sum>max_sum){
            max_sum = sum;
            }
        }
        
        return max_sum;
    }

    //move zeroes to the end following two pointer approach
    public void mvzero(int[] ar){
        int nz = ar[0];
        int z = ar[0];

        while (nz<ar.length) {
            if(ar[nz]!=0){
                int temp = ar[nz];
                ar[nz] = ar[z];
                ar[z] = temp;
                nz++;
                z++;
            }else {
                nz++;
            }
        }

        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]);
        }
    }


    public static void main(String[] args) {
        MoveZeroes mz = new MoveZeroes();
        // int[] array = {1,-4,-5,9,8,7,5,-9,-7};
        // System.out.print( mz.kadane(array));

        int[] array2 = {1,0,2,0,0,3,0,4,0,0,0,0,5,0};
        mz.mvzero(array2);
    }
}
