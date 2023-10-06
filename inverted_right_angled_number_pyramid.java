public class inverted_right_angled_number_pyramid {
    public static void main(String[] args) {
        
        pattern(4);
    }

    static void pattern(int n){
        
        for(int i=n; i>0; i--){
            for(int j=0; j<i; j++){
                System.out.print(j+1+" ");
            }
            System.out.println();
        }
    }
}
