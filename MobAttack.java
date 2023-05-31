import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MobAttack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MobAttack extends EnemyAttack
{
    public void MobAttack(HealthPlayer health, MobBosque boss,ObtainDamage obtainDamage){
        healthPlayer = health;
        mobBosque = boss;
        damage = bossNow.getDamage();
        action = obtainDamage;
    }
    public void act()
    {
        // Add your action code here.
    }
}
