import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BossAtack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BossAtack extends EnemyAttack
{
    /*HealthPlayer healthPlayer;
    Boss1Ada bossNow;
    ObtainDamage Action;*/
    //int damage;
    private final int COUNT_DOWN_MOUTH_START_VALUE = 100;
    private int mouthDelay = COUNT_DOWN_MOUTH_START_VALUE;
    public void BossAtack(HealthPlayer health, Boss1Ada boss,ObtainDamage obtainDamage){
        healthPlayer = health;
        bossNow = boss;
        damage = bossNow.getDamage();
        action = obtainDamage;
    }
    public void act()
    {
        //harm();
        if(bossNow.getIsAtack() == true){
            Damage(damage);
        }
    }
    /*private void Damage(int damage){
        healthPlayer.LoseHeart(damage);
        Action.Damage();
    }*/
    
    /*private void harm(){
        mouthDelay--;
        if(mouthDelay ==0){
            mouthDelay = COUNT_DOWN_MOUTH_START_VALUE;
            Damage(damage);
        }
    }*/
}
