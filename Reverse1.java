package one;

public class Reverse1 
{
    public static void main(String args[])
    {
        int a = 1892923456;

        while (a>0)
        {

            int lastDigit = a%10;
            System.out.print (lastDigit) ;
            a/= 10;

        }
    }  
}
