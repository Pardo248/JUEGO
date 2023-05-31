import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class CoolDown extends Actor
{
    private final int TIME_START_VALUE = 100;
    private int time = TIME_START_VALUE;
    
    Boolean isTime;
    public void act()
    {
        setImage(new GreenfootImage(120,120));
        getImage().drawRect(0,0,118,118);
        getImage().setColor(Color.BLACK);
        getImage().fillRect(1,1,118,118);
        getImage().setColor(Color.WHITE);
        getImage().fillRect(1,1,120,time);
        
        if(time != 0)
        {
            Time();
            isTime = false;
        }else
        {
            isTime = true;
        }
    }
    public void Use(){
        time = TIME_START_VALUE;
    }
    private void Time(){
        time--;
    }
    public Boolean getIsTime (){
        return isTime;
    }
}
