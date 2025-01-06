package one;

import java.util.Scanner;

public class primeJava {
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of int n -> ");
        int n = sc.nextInt();
        boolean isPrime = true;

        if (n ==2 ){
            System.out.println("n is prime");
        }
        else 
        {
        for(int i = 2; i <= n-1; i++)
           {
           if (i%n == 0)
           {
           isPrime = false;
           }
           }


        if (isPrime == true )
        {
         System.out.println("n is prime");
        }
        else 
           {
            System.out.println("n is not prime"); 
           }
        }
    }  
}
    

