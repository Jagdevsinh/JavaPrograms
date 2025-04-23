
package javaapplication2;

import java.sql.*;
public class dbcon {
    public static void main(String[] args)
    {
        Connection con;
        Statement st;
        try{
       Class.forName("com.mysql.jdbc.Driver");
       
       con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
       System.out.println("db connected....");
       
       st = con.createStatement();
       
       st.execute("create table s2student(Roll_no int,name varchar(20))");
        System.out.println("table created");
       
       int ans=st.executeUpdate("insert into s2student values(1,'aaa')");
       System.out.println(ans+"record inserted");
       con.close();
    }
        catch(Exception e)
                {
                System.out.println("Error"+e);
                }
    }
}
