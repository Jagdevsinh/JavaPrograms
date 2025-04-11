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
public class elseif {
    public static void main(String[] args)
    {
        int age;
        System.out.println("enter your age:");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if (age>58)
        {
            System.out.println("you are experrienced");
        }
        else if(age>40)
        {
             System.out.println("you are semi experrienced");
        }
        else if(age>30)
        {
            System.out.println("you are begginer");
        }
        else
        {
            System.out.println("you dont have experrince");
        }
    }
}
