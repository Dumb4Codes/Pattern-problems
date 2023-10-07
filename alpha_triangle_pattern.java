public class alpha_triangle_pattern {
    public static void main(String[] args) {
        
        pattern(5);
    }

    static void pattern(int n){

        for(int i=0; i<n; i++){
            for(char j=(char) ('E'-i); j<='E'; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
