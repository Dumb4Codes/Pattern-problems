public class increasing_letter_triangle {
    public static void main(String[] args) {
        
        pattern(4);
    }

    static void pattern(int n){

        for(int i=0; i<n; i++){
            for(char j='A'; j<='A'+i; j++){
                System.out.print(j+" ");  
            }
            System.out.println();
        }
    }
}
