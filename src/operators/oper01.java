package operators;

public class oper01 {
    public static void  main(String[] args){
        int a = 10;
        int b = 20;
        // Arthmetic operators
        System.out.println("add:"+(a+b)); //add by using string concat
        System.out.println(a-b); // sub
        System.out.println(a*2); // multiply
        System.out.println(a%b);// modulus
        System.out.println(b/2); // Divide

        // Relationship operators returns boolean value
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        //b  = 10;
        System.out.println(a!=b);

        // Logical operators returns boolean value
        // it can be used only with boolean data types
        boolean x=true;
        boolean y=false;
        System.out.println(x && y); //false
        System.out.println(x || y); // true
        System.out.println(!y); // true

        boolean b1= 10>23;
        System.out.println(b1); // false









    }
}
