import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BOSQUE here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BOSQUE extends World
{

    /**
     * Constructor for objects of class BOSQUE.
     * 
     */
    private int enemy;
    private int cantBase;
    
    public BOSQUE(int trofeos,int enemy){    
        super(1200, 750, 1);// Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        cantBase = trofeos;
        this.enemy = enemy;
        Prepare();
    }
    private void Prepare(){
        
        Player player = new Player();
        addObject(player,600,375);

        ObtainDamage obtainDamage = new ObtainDamage();
        addObject(obtainDamage,600,375);
        
        HealthPlayer healthPlayer = new HealthPlayer();
        addObject(healthPlayer,140,715);
        healthPlayer.HealthPlayer(player);
        
        Enemy actualEnemy = new Enemy();
        addObject(actualEnemy,1,350);
        actualEnemy.Enemy(enemy);
        
        HealthBar healthBar = new HealthBar();
        addObject(healthBar,600,50);
        healthBar.HealthBar(actualEnemy);
        
        ManaBar manaPlayer = new ManaBar();
        addObject(manaPlayer,140,725);
        manaPlayer.ManaBar(player);
        
        HealthPotion healthPotion = new HealthPotion();
        addObject(healthPotion,600,375);
        healthPotion.Items(healthPlayer,manaPlayer,cantBase);
        
        ManaPotion manaPotion = new ManaPotion();
        addObject(manaPotion,600,375);
        manaPotion.Items(healthPlayer,manaPlayer,cantBase);
        
        CoolDown coolDown = new CoolDown();
        addObject(coolDown,875,690);
          
        CoolDown coolDownMagic = new CoolDown();
        addObject(coolDownMagic,1005,690);
        
        CoolDown coolDownUltimate = new CoolDown();
        addObject(coolDownUltimate,1135,690);
          
        NormalAttack attack = new NormalAttack();
        addObject(attack,600,375);
        attack.Attack(healthBar,player,manaPlayer,coolDown);
        
        MagicAttack magicattack = new MagicAttack();
        addObject(magicattack,470,375);
        magicattack.Attack(healthBar,player,manaPlayer,coolDownMagic);
        
        Ultimate ultimate = new Ultimate();
        addObject(ultimate,340,375);
        ultimate.Attack(healthBar,player,manaPlayer,coolDownUltimate);
        
        EnemyAtack enemyAtack = new EnemyAtack();
        addObject(enemyAtack,340,375);
        enemyAtack.EnemyAtack(healthPlayer,actualEnemy,obtainDamage);
    }
}
