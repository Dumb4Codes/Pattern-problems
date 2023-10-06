public class right_angled_number_pyramid {
    public static void main(String[] args) {
        
        pattern(4);
    }

    static void pattern(int n){
        
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print(1+j+" ");
            }
            System.out.println();
        }
    }
}
