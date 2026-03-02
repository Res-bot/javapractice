public class dupl_val{
    public static void find_dupl(String name){
        char[] name2 = name.toCharArray();
        for (int i = 0; i < name2.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(name2[j]);
            }
            System.out.println();
        }
        
    }

    public static void main(String[] args) {
        String nam = "RAMANA";
        find_dupl(nam);
    }
}