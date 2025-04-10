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
public class practice {
      public static void main(String[] args)
      {
          String name = "PRACTICE";
          name = name.toLowerCase();
          System.out.println(name);
          
          //practice2
          String text="heelo to programming in java";
          text = text.replace("","_");
          System.out.println(text);
          //practice3
          String letter = "dear AAA thank you for change";
          letter = letter.replace("AAA","Java");
          System.out.println(letter);
          
          //practice4
          String newString = "This is contain double spacces";
          System.out.println(newString.indexOf("  "));
          System.out.println(newString.indexOf("   "));
      }
}
