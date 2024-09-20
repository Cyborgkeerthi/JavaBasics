package Typecasting;

public class cast {
    public static void main(String[] args){
        // Widening casting : Smaller data type to bigger data type
       /* byte a=100;
        int myInt= a; // Automatic casting: byte to int
        System.out.println(myInt); // 100

        */
        /* int b =29;
        double my=b;
        System.out.println(my); // 29.0

         */
        //narrow casting : Larger data type to smaller data type

        long number=8938737773l;
        int a= (int)number; //Manual casting: long to int
        System.out.println(a); // 348803181

    }
}
