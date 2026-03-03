public class frequency_count {

    public static void count_occur(int[] val){
        boolean[] isVis = new boolean[val.length];
        for (int i = 0; i < isVis.length; i++) {
            if (isVis[i]) {
                continue;
            }
            int count = 0;
            for (int j = 0; j < isVis.length; j++) {
                if (val[i] == val[j]) {
                    count++;
                    isVis[j] = true;
                }
            }
            System.out.println(val[i] + " : " + count);
        }
    }
    public static void main(String[] args) {
        int[] arval = {1,2,2,3,3,4,4,3,3,2,2,1};
        count_occur(arval);
    }
}
