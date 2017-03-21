import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo
import java.lang.String;

/**
 * Write a description of class Ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ball  extends Actor

{
    private int incx;
    private int incy;
    private int jugador1;
    private int jugador2;
    
    public Ball()
    {
        jugador1=0;
        jugador2=0;
        incx=3;
        incy=3;
        int dx,dy;
        dx=Greenfoot.getRandomNumber(10);//random para cambio de dirección x
        if(dx<=5)

            dx=1;
        else 
            dx=-1;
        dy=Greenfoot.getRandomNumber(10);//random para cambio de dirección y
        if(dy<=5)
            dy=1;
        else 
            dy=-1;
            
        incx*=dx;
        incy*=dy;
    }
    /**
     * Act - do whatever the Pelota wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     @Override
     public void act() 
     {
        int posx=this.getX();
        int posy = this.getY();// Add your action code here.
        int nuevox=posx+incx;
        int nuevoy=posy+incy;
        //cambiamos de posicion a la pelota
        World mundo=this.getWorld();
        if(jugador1==2 || jugador2==2)
        {
            incx=6;
            incy=6;
        }
        if(nuevox>mundo.getWidth()) //rebota en el lado derecho
        {
            incx=-incx;
        }
        if(nuevoy>mundo.getHeight())//rebota en la parte de abajo
        {
            jugador1++;
            nuevox=mundo.getWidth()/2;
            nuevoy=mundo.getHeight()/2;
            
        }
        if(nuevoy<0)
        {
            jugador2++;
            nuevox=mundo.getWidth()/2;
            nuevoy=mundo.getHeight()/2;
            
        }
         if(nuevox<0)
        {
            incx=-incx;
        }
        if(this.isTouching(Paddle.class))
        {
            incy=-incy;
            nuevoy=this.getY()+incy;
        }
        if((posx==mundo.getWidth()/2&&posy==mundo.getHeight()/2))
        {
            this.setLocation(nuevox,nuevoy);
            Greenfoot.delay(20);
        }
        else
        {
            
            this.setLocation(nuevox,nuevoy);
        }
        String str = jugador1 +"";
        mundo.showText("Jugador1", 60, 10);
        mundo.showText(str, 150, 10);
        mundo.showText("Jugador2", 80, 480);
        str = jugador2 + "";
        mundo.showText(str, 150, 480);
        if(jugador1==5 || jugador2==5)
        {
            Greenfoot.stop();
            if(jugador1==5)
            {
                mundo.showText("Jugador1 gano!!!!", mundo.getWidth()/2, mundo.getHeight()/2);
            }
            else if(jugador2==5)
            {
                mundo.showText("Jugador2 gano!!!", mundo.getWidth()/2, mundo.getHeight()/2);
            }
        }


    }   
}
