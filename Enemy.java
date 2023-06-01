import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    private int health = 1000;
    private int healthPas = health;
    private int healthNow;
    private int damage;
    private final int FAST = 30;
    private final int FAST_STEP = 30;
    private final int SLOW = 1;
    
    int bandera = 1;
    
    Boolean isAtack;
    private int enemyTipe; 
    
    protected final int COUNT_START_VALUE = 50;
    protected int COUNT = COUNT_START_VALUE;
    
    protected int CLOCK_START_VALUE = 100;
    protected int clock =  CLOCK_START_VALUE;
    
    private HealthBar healthBoss;
    public void Enemy(int boss){
        enemyTipe = boss;
        if(enemyTipe > 4){
             CLOCK_START_VALUE = 200;
        }
        SetBoss(boss);
    }

    private void SetBoss(int boss){
        if(boss == 1){
            setImage("images/Ada del bosque.png");
        }else if(boss == 2){
            setImage("images/BossDesert.png");
        }else if(boss == 3){
            setLocation(getX(), getY() + 50);
            setImage("images/BossCastle.png");
        }else if(boss == 4){
            setImage("images/Slime Woman.png");
            setLocation(getX(), getY() + 50);
        }else if(boss == 5){
            setImage("images/MobDesert.png");
            setLocation(getX(), getY() + 50);
        }else if(boss == 6){
            setImage("images/MobCastle.png");
            setLocation(getX(), getY() + 50);
        }
        
        setStats(boss);
    }
    private void setStats(int boss){
        if(boss == 1){
             damage = 2;
        }else if(boss == 2){
             damage = 5;
        }else if(boss == 3){
             damage = 10;
        }else if(boss == 4){
            damage = 1;
            health = health/2;
        }else if(boss == 5){
            damage = 2;
            health = health/2;
        }else if(boss == 6){
            damage = 5;
            health = health/2;
        }  
    }
    public void act()
    {
        Start();
        if(enemyTipe == 1 || enemyTipe == 2){
            Animation();
        }else
            Animation(enemyTipe);
        harm();
    }
    public int getHealth(){
        return health;
    }
    public int getDamage(){
        return damage;
    }
    private void harm(){
        clock--;
        if(clock == 0){
            clock =  CLOCK_START_VALUE;
            isAtack = true;
        }else
        {
            isAtack = false;
        }
    }
    private void Start(){
        if(getX() <= 600){
            setLocation(getX() + FAST, getY());
        }
    }
    private void Animation(){
        if(bandera == 1){
            setLocation(getX() , getY() + SLOW);
        }
        else{
           setLocation(getX() , getY() - SLOW); 
        }
        COUNT--;
        if(COUNT == 0){
            COUNT = COUNT_START_VALUE;
            bandera = bandera * -1;
        }

    }
    private void Animation(int enemyTipe){ 
        if(bandera == 1){
            setLocation(getX() + SLOW , getY() );
        }
        else{
           setLocation(getX() - SLOW , getY() ); 
        }
        COUNT--;
        if(COUNT == 0){
            COUNT = COUNT_START_VALUE;
            bandera = bandera * -1;
        }

    }
    public Boolean getIsAtack (){
        return isAtack;
    }
    
}
