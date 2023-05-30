import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boss1Ada here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss1Ada extends Boss
{
    static int health = 1000;
    static int damage = 5;
    static int armor = 1;
    private static final int FAST_STEP = 30;
    public void Boss1Ada(HealthPlayer health,Boss1Ada boss,ObtainDamage obtainDamage){
        BossAtack bossAtack = new BossAtack();
        bossAtack.BossAtack(health,boss,obtainDamage);
    }
    public void act()
    {
        Start();
        Animation();
    }
    public int getHealth(){
        return health;
    }
    public int getDamage(){
        return damage;
    }
    
}
