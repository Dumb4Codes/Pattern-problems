public class half_diamond_star {
    public static void main(String[] args) {
        
        pattern(4);
    }

    static void pattern(int n){

        for(int i=1; i<=n; i++){
            for(int j=0; j<i; j++){
                System.out.print("* ");
            }
            System.out.println();
            if(i==n){
                for(int j=1; j<n; j++){
                    for(int k=0; k<n-j; k++){
                        System.out.print("* ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
