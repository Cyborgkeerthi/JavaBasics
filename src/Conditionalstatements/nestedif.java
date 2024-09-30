package Conditionalstatements;

public class nestedif {
    public static void main (String[] args){
        int a=56;
        int b=97;
        int c=78;

        if (a>b && a>c)
        {
            System.out.println(a + "Largest number");
        }
        else if (b>a && b>c)
        {
            System.out.println(b + " is largest number");
        }
        else
        {
            System.out.println(c+ "is largest number");
        }
    }
}
