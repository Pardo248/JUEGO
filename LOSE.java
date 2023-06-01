import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LOSE here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LOSE extends World
{

    /**
     * Constructor for objects of class LOSE.
     * 
     */
    public LOSE(float score)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 750, 1);
        showText("Score: " + score,600,100);
    }
}
