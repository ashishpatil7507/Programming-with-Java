import java.util.*;
public class taxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double tax;
       String input = "";
       do{
         System.out.print("Enter Your Encome :- ");
        int income = sc.nextInt();
       
        
        if(income < 5){
            System.out.println("Your income is " + income + " Under 5.Lakh So You don't Have to pay Tax ");
            }
        else if(income > 5 && income < 10){
            System.out.println("your Income Is " +income +" ,soo You have to pay 20 % tax");
             tax = (income *0.20);
             System.out.println("Thus Your tax Will be" + tax + "%");

        }
        else if(income > 10)
        {
        System.out.println("Your Income Is Above 10 Lakh so, You Have to pay 30% of Tax");
           tax = income*0.30;
           System.out.println(" Thus Your tax Will be "+ tax);
        }
        else {
            System.out.println("Please Enter Correct Details ");
        }

        System.out.println("Do want To exit enter exit" );
        sc.nextLine();
         input = sc.nextLine();

       }while(!input.equals("exit"));

        }
    }
    
