import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Disparo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Disparo extends Actor
{
    /**
     * Act - do whatever the Disparo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown("space"))
        {
            //Muevete a la izquierda
            this.setLocation(this.getX() , this.getY()-10);
            if (this.getY() == 0)
            {
                World mundo = this.getWorld();
                mundo.removeObject(this);
            } 
        }
        else if(this.isTouching(Pelota.class))
        {
            this.removeTouching(Pelota.class);
        }
    }
}    
