public class diamond_star {
    public static void main(String[] args) {
        
        pattern(4);
    }

    static void pattern(int n){

        for(int i=1; i<=n; i++){

            for(int j=0; j<n-i; j++){
                System.out.print(" ");
            }
            for(int k=0; k<2*i-1; k++){
                System.out.print("*");
            }
            for(int l=0; l<n-i; l++){
                System.out.print(" ");
            }
            System.out.println();
        }
        
        for(int i=n; i>0; i--){
            
            for(int j=0; j<n-i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<2*i-1; j++){
                System.out.print("*");
            }
            for(int j=0; j<n-i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
