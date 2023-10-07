public class alpha_hill {
    public static void main(String[] args) {
        
        pattern(4);
    }

    static void pattern(int n){

        for(int i=0; i<n; i++){
            
            for(int j=1; j<n-i; j++){
                System.out.print(" ");
            }
            char ch = 'A';
            int breakPoint = (2*i+1) / 2;

            for(int j=0; j<2*i+1; j++){
                System.out.print(ch);
                
                if(j < breakPoint) ch++;
                else ch--;
            }
            for(int j=1; j<n-i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
