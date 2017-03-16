import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class Jugador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jugador extends Actor
{
    private boolean disparando;
    
    @Override
    public void act() 
    {
        //Si precionas la flecha derecha
        if(Greenfoot.isKeyDown("Right"))
        {
            //Muevete a la derecha
            this.setLocation(this.getX() + 10, this.getY() );
        }
        if(Greenfoot.isKeyDown("Left"))
        {
            //Muevete a la izquierda
            this.setLocation(this.getX() - 10, this.getY() );
        }
        if(Greenfoot.isKeyDown("space") && !disparando)
        {   
            Disparo disp = new Disparo();
            World mundo = this.getWorld();
            mundo.addObject(disp, this.getX(), this.getY());
            disparando = true;
            
        }
        
        //revisar cuantos disparos hay en el mundo
        World mundo = this.getWorld();
        List lista = mundo.getObjects(Disparo.class);
        if(lista.isEmpty())
        {
            disparando = false;
        }
    }    
}
