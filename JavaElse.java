package one;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaElse {
    
public static void main(String args[]) {
    
    try (Scanner sc = new Scanner( System.in)) {
        int age = sc.nextInt();

        if (age >= 18 ){
            System.out.println(" Adult");
        }
        else
        System.out.println(" Not adult");

    } catch (InputMismatchException e) {
        System.out.println("Invalid input, Please enter a positive number.");
    }
  }
}
