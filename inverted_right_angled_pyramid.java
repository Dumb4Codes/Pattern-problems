public class inverted_right_angled_pyramid {
    public static void main(String[] args) {
        
        pattern(4);
    }

    static void pattern(int n){
        
        for(int i=n; i>0; i--){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
