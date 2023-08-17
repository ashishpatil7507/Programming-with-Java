import java.util.*;
public class oddOrEven {
    public static void main(String[] args) {
        System.out.println("In this Example We See The Number Is Even or Odd");
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of A :- ");
        int numA = sc.nextInt();

        if((numA % 2) ==0 || numA == 0 ){
            System.out.println(numA + " is the even Number");
        }
    
        else {
            System.out.println(numA + " is The  odd Value");
        }
    
    }
}