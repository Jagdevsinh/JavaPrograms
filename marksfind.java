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
public class marksfind {
    public static void main(String[] args)
    {
        byte p1,p2,p3;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your java marks");
        p1 = sc.nextByte();
        
        System.out.println("enter your react marks");
        p2=sc.nextByte();
        
        System.out.println("enter your laravel marks");
        p3=sc.nextByte();
        
        float avg = (p1+p2+p3)/3.0f;
        if(avg>= 48 && p1>=33 && p3>=33)
        {
            System.out.println("Congrats you are success");
        }
        else
        {
            System.out.println("not success yet");
        }
    }
}
