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
public class inhanceswitch {
    public static void main(String[] args)
    {
        System.out.println("enter day");
             Scanner sc = new Scanner (System.in);
    int day = sc.nextInt();

    switch(day){
        case 1:
            System.out.println("monday");
            break;
             case 2:
            System.out.println("tuesday");
            break;
            case 3:
            System.out.println("wednesday");
            break;
             case 4:
            System.out.println("thursday");
            break;
             case 5:
            System.out.println("friday");
            break;
             case 6:
            System.out.println("saturday");
            break;
             case 7:
            System.out.println("sunday");
            break;
             default:
                 System.out.println("enter valid day");
} 
}
}