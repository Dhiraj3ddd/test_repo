package one  ;

import java.util.Scanner;

public class Function1 {
   public static int calculateSum(int num1 , int num2){
    int sum = num1 + num2 ;
    return sum;
   } 

public static void main(String args[]){

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int add = calculateSum(a, b);
    System.out.println("sum is : "+ add);
}   
}
