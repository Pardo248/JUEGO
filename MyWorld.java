import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class MyWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {
        super(1200, 750, 1);
        
        BOTON boton = new BOTON();
        addObject(boton,600,375);
        
        
        /*MouseInfo mi = Greenfoot.getMouseInfo();
        if (mi != null)
        {
        int buttonNumber = mi.getButton();
        if (buttonNumber == 3)
        {
        //whatever I want it to do
        }*/
    
    }
    
}
