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
public class threesubtot {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter subject 1 mark:");
        int a = sc.nextInt();
        System.out.println("enter second :");
        int b = sc.nextInt();
        System.out.println("enter third");
        int c = sc.nextInt();
        int sum = a+b+c;
        System.out.println(sum);
    }
}
