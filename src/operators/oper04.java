package operators;

public class oper04 {
    public static void main(String [] args){
        // Ternary operators
        // condition ? expression_if true : expression_if false
        // ex:01
        int a =10;
        int b =20;
        int x=(a>b)? a: b; // a>b = false returns b value
        int z=(a<b)? a: b; // a<b = true returns a value
        System.out.println(x);
        System.out.println(z);

        // ex: 02
        int c=(1==1)?100:900;
        int d=(2==1)?100:900;
        System.out.println(c); //output : 100
        System.out.println(d); //output : 900

        //ex:03
        int age =30;
        String result=(age>18)? "elgible": "not eligble";
        String result1=(age<18)? "elgible": "not eligble";
        System.out.println(result);
        System.out.println(result1);


    }
}
