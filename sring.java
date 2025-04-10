/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ytpractice;

/**
 *
 * @author jagde
 */
public class sring {
    public static void main(String[] args)
    {
        String name = "AAa";
        int value = name.length();
        System.out.println(value);
        
        String lstring = name.toLowerCase();
        System.out.println(lstring);
        
        String ustring = name.toUpperCase();
        System.out.println(ustring);
        
       String nonTrimmedString="    AAA    ";
       System.out.println(nonTrimmedString);
          
        String trimmedString = nonTrimmedString.trim();
        System.out.println(trimmedString);
        
        System.out.println(name.substring(2));
       
        System.out.println(name.substring(1,3));
        
        System.out.println(name.startsWith("AA"));
        
          System.out.println(name.endsWith("AA"));
            System.out.println(name.endsWith("a"));
            
           System.out.println(name.charAt(0));
           
           System.out.println(name.charAt(2));
        
         System.out.println(name.indexOf("a"));

           String namee = "OOPOP";
           
      System.out.println(namee.indexOf("O"));

            System.out.println(namee.lastIndexOf("P",3));

          System.out.println(namee.equals("oopop"));
      System.out.println(namee.equals("OOPOP"));
      
      System.out.println(namee.equalsIgnoreCase("oopoop"));

      System.out.println("hi i am \" Doublequete");
            System.out.println("hi i am \n Doublequete");
      System.out.println("hi i am \t Doublequete");

    }
}
