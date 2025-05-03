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
public class Hierarchical {
    void display()
    {
        System.out.println("indoor and outdoor games");
    }
}
class Cricket extends Hierarchical
{
    void display()
    {
        System.out.println("outdoor games");
    }
}
class chess extends Hierarchical
{
    void display()
    {
        System.out.println("indoor games"); 
    }
}
class TestGame
{
    public static void main(String[] args)
    {
        Hierarchical game;
        game=new Cricket();
        game.display();
        game=new chess();
        game.display();
    }
}

