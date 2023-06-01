import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BossAtack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyAtack extends Actor
{
    HealthPlayer healthPlayer;
    Enemy enemyNow;
    ObtainDamage action;
    HealthBar healthBar;
    
    private int damage;
    private final int COUNT_DOWN_MOUTH_START_VALUE = 100;
    private int mouthDelay = COUNT_DOWN_MOUTH_START_VALUE;
    public void EnemyAtack(HealthPlayer health, Enemy enemy,ObtainDamage obtainDamage){
        healthPlayer = health;
        enemyNow = enemy;
        damage = enemyNow.getDamage();
        action = obtainDamage;
    }
    public void act()
    {
        //harm();
        if(enemyNow.getIsAtack() == true){
            Damage(damage);
        }
    }
    protected void Damage(int damage){
        healthPlayer.LoseHeart(damage);
        action.Damage();
    }
}
