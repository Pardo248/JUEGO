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
    DESERT desert = new DESERT();
    public void act()
    {   
        if(Greenfoot.isKeyDown("p")){
             Greenfoot.setWorld(bosque);
        }
        if(Greenfoot.isKeyDown("o")){
             Greenfoot.setWorld(desert);
        }
        if(Greenfoot.isKeyDown("i")){
             Greenfoot.setWorld(castle);
        }
    }
}
