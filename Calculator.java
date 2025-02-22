package one;

import java.util.Scanner ;

public class Calculator {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number a ->" );
        int a = sc.nextInt();
        
        System.out.println("Enter number b -> ");
        int b = sc.nextInt();
        
        char operator = sc.next().charAt(0);

        switch (operator){
            case '+' : System.out.println("Result is -> " + (a+b));
                       break;
            case '-' : System.out.println("Result -> " + (a-b));
                       break;
            case '*' : System.out.println("Result -> " + (a*b));
                       break;
            case '/' : System.out.println("Result -> " + (a/b));
                       break;
            case '%' : System.out.println("Result -> " + (a%b));
                       break;

            default : System.out.println("Unexpected input , please provide valid input ");

        }    
    }   
}
