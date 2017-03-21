import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Paddle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Paddle extends Actor
{
    /**
     * Act - do whatever the Paddle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("a") && this.getY()>350)
        {
            this.setLocation(this.getX()-20, this.getY());
        }
        if(Greenfoot.isKeyDown("left") && this.getY()<350)
        {
            this.setLocation(this.getX()-20, this.getY());
        }
        if(Greenfoot.isKeyDown("s") && this.getY()>350)
        {
            this.setLocation(this.getX()+20, this.getY());
        }
        if(Greenfoot.isKeyDown("right") && this.getY()<350)
        {
            this.setLocation(this.getX()+20, this.getY());
        }

    }    
}
