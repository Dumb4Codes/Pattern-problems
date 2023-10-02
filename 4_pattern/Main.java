
public class Main {
    public static void main(String[] args) {
        
        // patterns (rules)

        // 1. for the outer loop, count the number of lines
        // 2. for the inner loop, focus on the columns and connect them somehow to the rows
        // 3. print them '*' inside the inner loop
        // 4. observe symmetry (optional)

        pattern(10);
    }
    static void pattern(int n){

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
