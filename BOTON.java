import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BOTON here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BOTON extends Actor
{
    BOSQUE bosque = new BOSQUE();
    CASTLE castle = new CASTLE();
    public void act()
    {   
        if(Greenfoot.isKeyDown("p")){
             Greenfoot.setWorld(bosque);
        }
        /*if(Greenfoot.isKeyDown("2")){
             Greenfoot.setWorld(start);
        }
        if(Greenfoot.isKeyDown("3")){
             Greenfoot.setWorld(start);
        }
        if(Greenfoot.isKeyDown("4")){
             Greenfoot.setWorld(start);
        }
        if(Greenfoot.isKeyDown("5")){
             Greenfoot.setWorld(start);
        }
        if(Greenfoot.isKeyDown("6")){
             Greenfoot.setWorld(start);
        }*/
    }
}
