public class hollow_rectangle {
    public static void main(String[] args) {
        
        pattern(5);
    }

    static void pattern(int n){

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==1 || i==n || j==1 || j==n) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
