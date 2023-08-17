public class solidRhombus {

    public static void solRhombus(int n) {
        for (int i = 1; i <= n; i++) {
            //spaces(n-1)-->j
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }

            // stars i--->n
            for (int s = 1; s <= n; s++) {
                    System.out.print("* ");
            }
            System.out.println();
           
        }
     

    }

    public static void main(String[] args) {
        solRhombus(5);
    }
}
