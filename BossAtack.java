import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BossAtack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BossAtack extends Actor
{
    HealthPlayer healthPlayer;
    Boss1Ada bossNow;
    ObtainDamage Action;
    int damage;
    private static final int COUNT_DOWN_MOUTH_START_VALUE = 100;
    private int mouthDelay = COUNT_DOWN_MOUTH_START_VALUE;
    public void BossAtack(HealthPlayer health, Boss1Ada boss,ObtainDamage obtainDamage){
        healthPlayer = health;
        bossNow = boss;
        damage = bossNow.getDamage();
        Action = obtainDamage;
    }
    public void act()
    {
        harm();
    }
    
    private void harm(){
        mouthDelay--;
        if(mouthDelay ==0){
            mouthDelay = COUNT_DOWN_MOUTH_START_VALUE;
            healthPlayer.LoseHeart(damage);
            Action.Damage();
            
        }
    }
}
