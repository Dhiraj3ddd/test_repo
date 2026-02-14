package one;

import java.util.Scanner;

public class JavaAdd {
    public static void main(String args[]){
      Scanner sc = new Scanner( System.in);
      
      System.out.println("Enter number a ->" );
      int a = sc.nextInt();
      
      System.out.println("Enter number b -> ");
      int b = sc.nextInt();
    
    int result = a + b ;
    System.out.println ("a + b =  " + result);
  }
}
