package one;

import java.util.Scanner;

public class Function1 {
   public static int calculateSum(int num1 , int num2){
    int sum = num1 +  num2;
    return sum;
   } 

public static void main( String args[] ){

    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int add = calculateSum(x, y);
    System.out.println("sum is ->"+ add);
}   
}
