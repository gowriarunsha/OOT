
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.*;
/* <applet code="TrafficLight.class" width="1000" height="500"><\applet>*/

/**
 *
 * @author student
 */
public class TrafficLight extends Applet implements Runnable {

     Thread t1=new Thread(this,"MainThread");
    int c;
    public void init() {
        
        t1.start();
        
    }

    // TODO overwrite start(), stop() and destroy() methods
    
    public void paint(Graphics g)
    {
        if(c==1)
        {
            g.setColor(Color.RED);
        g.fillOval(850, 150, 100, 100);
        }
        else if(c==2)
        {
            g.setColor(Color.YELLOW);
        g.fillOval(850,300,100,100);
        }
        else if(c==3)
        {
            g.setColor(Color.GREEN);
        g.fillOval(850, 450, 100, 100);
        }
      
    }
    public void run()
    {
        int i;
    
            {
                c=1;
                
                for(i=0;i<10;i++)
                        {
                            c=1;
                            repaint();
                            
                        }
                        
                for(i=10; i<=20;i++)
                {
                    c=2;
                    repaint();
                    
                }
                for(i=21;i<30;i++){
                    c=3;
                    repaint();
                    
                }
                
               
            }
    }
   
}
