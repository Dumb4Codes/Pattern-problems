public class increasing_number_triangle {
    public static void main(String[] args) {
        
        pattern(4);
    }

    static void pattern(int n){

        int start = 1;

        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print(start+" ");
                start++;
            }
            System.out.println();
        }
    }
}
