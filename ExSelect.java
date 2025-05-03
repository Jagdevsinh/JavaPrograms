/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;
import java.sql.*;
public class ExSelect {
    public static void main(String[] args)
    {
    Connection con;
    Statement st;
    ResultSet rs;
    int rno;
    String nm;
    
    try
    {
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
        st=con.createStatement();
        rs=st.executeQuery("Select * from student");
        while(rs.next())
        {
            rno=rs.getInt(1);
            nm=rs.getString(2);
            System.out.println("rollno:"+rno+"Name:"+nm);
        }
        con.close();
}
    catch(Exception e)
    {
        System.out.println();
    }
}
}