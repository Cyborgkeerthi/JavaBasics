package Strings;

import java.util.Arrays;

public class String01 {
    public static void main (String [] args){
        String s = "Welcome";
        String s2 = "babu";
        String s3 = "Mari";
        System.out.println(s);
        System.out.println(s.length()); // 7

        // Concat
        System.out.println(s + " " +s2);
        System.out.println(s.concat(s3));

        // trim - remove right and left spaces
        String s4 = "   hi   ";
        System.out.println(s4); // Before trim
        System.out.println(s4.trim());//remove right and left spaces

        // charAt() - return the character of the string based on index
        System.out.println(s.charAt(5)); // "welcome - s(5)=m

        // contains() - return true or false
        String s5="good morning";
        System.out.println(s5.contains("el")); // false
        System.out.println(s5.contains("oo")); // true

        // equals() ,equalsIgnorecase()
        String a="bad";
        String b= "bad";
        System.out.println(a.equals(b));//true
        System.out.println(a.equals("Bad")); // false
        System.out.println(a.equalsIgnoreCase("Bad"));//true

        //replace() - replace single /multiple of character
        String d = " welcome to the java world";
        System.out.println(d.replace('o' ,'l')); //welclme tl the java wlrld
        System.out.println(d.replace("java","python")); //welcome to the python world

        //substring() - extract substring from main string
        String c= "Testing";
        System.out.println(c.substring(0,4)); //Test
        System.out.println(c.substring(2,6)); //stin

        //touppercase() ,tolowercase()
        System.out.println(c.toLowerCase()); //testing
        System.out.println(c.toUpperCase());//TESTING

        //split() = Split the string to multiple parts based o delimeter
        String s6 = "hello@people";
      String A[]= s6.split("@");
      System.out.println(Arrays.toString(A)); //[hello, people]
      System.out.println(A[0]); //hello


    }
}
