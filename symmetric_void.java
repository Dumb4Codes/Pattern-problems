public class symmetric_void {
    public static void main(String[] args) {
        
        pattern(5);
    }

    static void pattern(int n){

        for(int i=n; i>0; i--){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            for(int j=0; j<n-i; j++){
                System.out.print("    ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int j=1; j<=n; j++){
            for(int k=0; k<j; k++){
                System.out.print("* ");
            }
            for(int k=0; k<n-j; k++){
                System.out.print("    ");
            }
            for(int k=0; k<j; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
