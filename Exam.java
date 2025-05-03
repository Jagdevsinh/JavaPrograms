/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;
import java.sql.*;
import java.util.Scanner;

public class Exam {

  
    public static void main(String[] args) {
     Connection con;
     PreparedStatement pst;
     
     int ans=0;
     try{
         Class.forName("com.mysql.jdbc.Driver");
         con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
         pst=con.prepareStatement("insert into student values(?,?)");
         Scanner sc=new Scanner(System.in);
         System.out.println("no of records");
         int n=sc.nextInt();
         for(int i=1;i<=n;i++)
         {
             System.out.println("enter roll no ");
             int rno=sc.nextInt();
             System.out.println("enter name");
             String nm=sc.next();
             pst.setInt(1,rno);
             pst.setString(2,nm);
             ans+=pst.executeUpdate();
         }
         System.out.println(ans+"record inserted");
         con.close();
     }
     catch(Exception e)
     {
         System.out.println("error"+e);
     }
    }
    
}
