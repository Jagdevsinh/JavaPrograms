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
public class switchcase {
    public static void main(String[] args)
    {
        int age;
        System.out.println("enter age:");
        Scanner sc = new Scanner(System.in);
        age= sc.nextInt();
        
        switch(age){
            case 60:
                System.out.println("you are senior cityzen");
                break;
                
            case 35:
                 System.out.println("you are middle aged");
                 break;
                 
            case 25:
                System.out.println("you are begginer");
                break;
            default:   
                System.out.println("enjoy every moment of life");
 
        }
    }
}
