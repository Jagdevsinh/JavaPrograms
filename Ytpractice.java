/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ytpractice;
import java.util.Scanner;
/**
 *
 * @author jagde
 */
public class Ytpractice {

    /**
     * @param args the command line arguments78
     */
    public static void main(String[] args) {
      System.out.println("taking input from user");
      Scanner sc = new Scanner(System.in);
      System.out.println("enter first number :");
      int a = sc.nextInt();
      System.out.println("enter second number:");
      int b = sc.nextInt();
      int sum = a+b;
      System.out.println(sum);
    }
    
}
