/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

/**
 *
 * @author jagde
 */
public class threadex {
    
}
class X implements Runnable
{  
    public void run()
    {
	
	for(int i=1;i<5;i++)
	{
		System.out.println("From Thread X:i = "+i);
		
	}
	System.out.println("Exit from X");
	}
}    
class Y implements Runnable
{  
   public void run()
	{
	
	 for(int i=1;i<5;i++)
	{
		System.out.println("From Thread Y:i = "+i);
		
	}
	System.out.println("Exit from Y");
}
}  
class Thread_Ex
{
    public static void main(String args[])
    {  
    	X x1=new X();  
    	Thread t1 =new Thread(x1);  
		t1.start();  
		Y y1 = new Y();
		Thread t2 = new Thread(y1);
		t2.start();
     }  
} 