import java.util.*;
public class calculatorBySwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter 'add' For Addition");
        System.out.println("Enter 'mul' For Multiplication");
        System.out.println("Enter 'div' For Division");
        System.out.println("Enter 'sub' For Substraction");
        System.out.print ("Enter The choice:- add | Mul | div | sub:- " );
        String a = sc.next();
        switch(a){
            case("add"): System.out.println("You Selected to Addition"); 
            System.out.print("Enter first number:- ");
            int num1 = sc.nextInt();
            System.out.print("Enter Second Number");
            int num2 = sc.nextInt();
            int add = num1  + num2 ;
            System.out.println(add);
            break;
            case("mul"): System.out.println("You Selected to Multiplication");
             System.out.print("Enter first number:- ");
            int num3 = sc.nextInt();
            System.out.print("Enter Second Number");
            int num4 = sc.nextInt();
            int mul = num3  * num4 ;
            System.out.println(mul);
            break;
            case("div"): System.out.println("You Selected to Division");
             System.out.print("Enter first number:- ");
            int num5 = sc.nextInt();
            System.out.print("Enter Second Number");
            int num6 = sc.nextInt();
            int Div = num5  / num6 ;
            System.out.println(Div);
            break;
            case("sub"): System.out.println("You Selected To Substration");
             System.out.print("Enter first number:- ");
            int num7 = sc.nextInt();
            System.out.print("Enter Second Number");
            int num8 = sc.nextInt();
            int sub = num7  - num8 ;
            System.out.print(sub);
            break;
            default:System.out.println("Thank you");
            break;

        }

    }
}
