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
public class percentage {
    public static void main(String[] args){
    System.out.println("percentage of marks");
    Scanner sc = new Scanner(System.in);
    System.out.println("enter subject 1 mark:");
    int a = sc.nextInt();
    System.out.println("enter subject 2 mark:");
    int b = sc.nextInt();
    System.out.println("enter subject 3 mark:");
    int c = sc.nextInt();
    System.out.println("enter subject 4 mark:");
    int d = sc.nextInt();
    System.out.println("enter subject 5 mark:");
    int e = sc.nextInt();
    int sum = a+b+c+d+e;
    int summ = (sum*100/500);
 
   
    System.out.println(summ);
}
}