// package pattern;
import java.util.*;
public class invertedTrianglePattern {

    public static void Invpat(int n){
        // Outer Loop
        for(int i=0; i<=n; i++){
            // inner Loop - 1
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for (int k=0; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number To Print Inverted Pattern:- ");
        int s = sc.nextInt();
        Invpat(s);
    }
}
