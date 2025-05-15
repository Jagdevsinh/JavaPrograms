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
public class readwritefile {
    
	public static void main(String args[])throws Exception
	{  
	  FileInputStream fin=new FileInputStream("one.txt");  
	  FileOutputStream fout=new FileOutputStream("two.txt");  
	  int i=0;  
	  while((i=fin.read())!=-1)
	  {  
	    	fout.write((byte)i);  
	   }  
	    System.out.println("1 file copied");
	    fin.close(); 
	    fout.close();  
	     
   	 }  
}
