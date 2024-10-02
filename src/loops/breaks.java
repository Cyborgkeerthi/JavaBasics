package loops;

public class breaks {
    public static void main (String[] args){
       /* for(int i=1;i<=10;i++)
        {
            if(i==5)
            {
                continue; // it will skip the 5 and move back to for loop statement
            }
            System.out.println(i);
        }

        */

        for(int i=1;i<=10;i++)
        {
            if(i==5)
            {
                break; // it will break the for loop statement when i==5
            }
            System.out.println(i);
    }
}}
