public class number_crown {
    public static void main(String[] args) {
        
        pattern(4);
    }

    static void pattern(int n){

        for(int i=n; i>0; i--){
            int start = 1;
            for(int j=0; j<=n-i; j++){
                System.out.print(start+" ");
                start++;
            }
            for(int j=0; j<2*i-2; j++){
                System.out.print("  ");
            }
            for(int j=0; j<=n-i; j++){
                start--;
                System.out.print(start+" ");
                
            }
            System.out.println();
        }
    }
}
