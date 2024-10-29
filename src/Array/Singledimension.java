package Array;

public class Singledimension {
    //Declare an array
    //Add values into array
    // Find size of an array
    // Read single value from an array
    // Read multiple value from an array
    public static void main (String[] args){
        // Approach 1
        // Declaring
       /* int a[]= new int[5];
        //Add values into array
        a[0]=10;
        a[1]=20;
        a[2]=30;
        a[3]=40;
        a[4]=50;
        */
        // Approach 2
        int a[]={10,20,30,40};
        System.out.println(a[2]); //Read single value from an array
        System.out.println(a.length); // length of an array

        // Read multiple values from an array
       /* for (int i =0 ; i < a.length;i++){ // Read multiple value from an array
            System.out.println(a[i]);
        }

        */
        // Enhanced for loop

        for (int x:a){
            System.out.println(x);
        }

    }
}
