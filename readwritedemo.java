/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;
import java.io.*; 
/**
 *
 * @author jagde
 */
public class readwritedemo {
    

  
  	  public static void main(String args[])
	  {  
     		 try
		{  
			//Writing to File
      			 FileWriter fw=new FileWriter("New_Test.txt");  
      			 fw.write("I m studying in Atmiya University");  
      			 fw.close();
			// Reading from File
			 FileReader fr=new FileReader("New_Test.txt");  
			 int i;  
    			 while((i=fr.read())!=-1)  
      				System.out.print((char)i);  
      
      			 fr.close();    
     		 }
		catch(Exception e)
		{
			System.out.println(e);
		}  
	       System.out.println("\nsuccess");  
     	}  
} 
