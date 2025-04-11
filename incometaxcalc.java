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
public class incometaxcalc {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your income");
        float tax=0;
        float income = sc.nextFloat();
        if(income<1.4)
        {
            tax=tax+0;
        }
       else if(income>1.4f && income<=3f)
        {
            tax=tax+0.05f*(income-1.4f);

        }
        else if(income>5f && income<=10.0f)
        {
             tax=tax+0.05f*(5.0f-1.4f);
            tax=tax+1.4f*(income-5f);
        }
        else if(income>10.0f)
        {
         tax=tax+0.05f*(5.0f-1.4f);
         tax=tax+0.05f*(10.0f-5f);
         tax=tax+0.3f*(income-10.0f);

        }
        System.out.println("total tax paid by employee"+tax);
    }
}
