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
    static int damage;
    static int armor = 1;
    private static final int FAST_STEP = 30;
    private void SetBoss(int boss){
        if(boss == 1){
            setImage("images/Ada del bosque.png");
        }else if(boss == 2){
            setImage("images/BossDesert.png");
        }else{
            setImage("images/BossCastle.png");
        }
        
        setStats(boss);
    }
    private void setStats(int boss){
        if(boss == 1){
             damage = 2;
        }else if(boss == 2){
             damage = 5;
        }else{
             damage = 10;
        }  
    }
    public void Boss1Ada(HealthPlayer health,ObtainDamage obtainDamage,int boss){
        BossAtack bossAtack = new BossAtack();
        bossAtack.BossAtack(health,this,obtainDamage);
        
        SetBoss(boss);
    }
    public void act()
    {
        Start();
        Animation();
        harm();
    }
    public int getHealth(){
        return health;
    }
    public int getDamage(){
        return damage;
    }
    protected void harm(){
        mouthDelay--;
        if(mouthDelay ==0){
            mouthDelay = COUNT_DOWN_MOUTH_START_VALUE;
            isAtack = true;
        }else
        {
            isAtack = false;
        }
    }
}
