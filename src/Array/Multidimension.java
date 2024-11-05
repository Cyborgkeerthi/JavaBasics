package Array;

public class Multidimension {
    public static void main (String[] args){
        // Approach 1
        /*int a [] [] = new int[2][3];
        a[0][0]=100;
        a[0][1]=15300;
        a[0][2]=1500;
        a[1][0]=200;
        a[1][1]=100;
        a[1][2]=100;

         */
        // Approach 2
        int a [] [] = {{100,200},{300,644},{893,837}};
        System.out.println(a[1][1]);
// For loop
      /*  for (int b = 0; b < a.length; b++) {         // Loop through rows
            for (int c = 0; c < a[b].length; c++) {   // Loop through columns in each row
                System.out.print(a[b][c] + " ");
            }
            System.out.println();  // New line after each row
        }

       */
// Enhanced for
        for (int arr[]:a){ // a=100,200 - arr = 100,200
            for (int x:arr){
                System.out.println(x);
            }
        }

    }
}
