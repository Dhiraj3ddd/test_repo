package one;

public class swap {
    public static void swap (int a, int b){

        int temp = a;
        a = b;
        b = temp ;

        System.out.println("value of a : " + a);
        System.out.println("value of b : " + b);
    }

    public static void main (String args[]){
        swap(11,22);
    }
}
