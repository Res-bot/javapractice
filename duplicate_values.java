public class duplicate_values {

    public static void dupl_val(int[] val){
        int count = 1;
        for (int i = 0; i < val.length; i++) {
            for (int j = 1; j < val.length; j++) {
                if(val[i] == val[j]){
                    count++;
                }
            }
        }
        if(count > 2){
            System.out.println("Duplicate values exist in the array");
        }else{
            System.out.println("Duplicate values does not exist in the array");
        }
    }
    public static void main(String[] args) {
        int[] arrval = {1,2,3,4,2,3,4,5,6,7};
        dupl_val(arrval);   
    }
}
