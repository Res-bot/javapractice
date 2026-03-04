public class MoveZeroesToEnd {
    public void move(int[] arr){
       int nz = arr[0];
       int z = arr[0];
       while (nz<arr.length) {
            if (arr[nz] != 0) {
                int temp = arr[nz];
                arr[nz] = arr[z];
                arr[z] = temp;
                nz++;
                z++;
            }else{
                nz++;
            }
       }
       for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
       }
    }
    public static void main(String[] args) {
        int[] arr = {0,1,0,2,0,3,0,4,0,0,0,5};
        MoveZeroesToEnd me = new MoveZeroesToEnd();
        me.move(arr);
    }
}
