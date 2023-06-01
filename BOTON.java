import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BOTON here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BOTON extends Actor
{ 
    int SUPONGO = 3;
    public void act()
    {   
        if(Greenfoot.isKeyDown("p")){
            BOSQUE bosque = new BOSQUE(SUPONGO,1);
             Greenfoot.setWorld(bosque);
        }
        if(Greenfoot.isKeyDown("o")){
            DESERT desert = new DESERT(SUPONGO,2);
             Greenfoot.setWorld(desert);
        }
        if(Greenfoot.isKeyDown("i")){
            CASTLE castle = new CASTLE(SUPONGO,3);
             Greenfoot.setWorld(castle);
        }
        if(Greenfoot.isKeyDown("ñ")){
            BOSQUE bosque = new BOSQUE(SUPONGO,4);
             Greenfoot.setWorld(bosque);
        }
        if(Greenfoot.isKeyDown("l")){
            DESERT desert = new DESERT(SUPONGO,5);
             Greenfoot.setWorld(desert);
        }
        if(Greenfoot.isKeyDown("k")){
            CASTLE castle = new CASTLE(SUPONGO,6);
             Greenfoot.setWorld(castle);
        }
    }
}
