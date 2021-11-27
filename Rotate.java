/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
/*<applet code=rotate width=2500 height=2500 >
</applet>
*/
public class rotate extends Applet implements Runnable, ActionListener{

    
    Thread t;
    int p, k=0;
    @Override
    public void init() {
        
        // TODO start asynchronous download of heavy resources
    }
    @Override
    public void start(){
        t = new Thread(this);
        t.start();
    }
    @Override
    public void run(){
        for(k=0; k<500; k++){
            if(k%2==0){
                try{Thread.sleep(100);}catch(Exception e){}
                p=1;
                repaint();
                
            }
            else{
                try{Thread.sleep(100);}catch(Exception e){}
                p=0;
                repaint();
            }
        }
    }
    // TODO overwrite start(), stop() and destroy() methods

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void paint(Graphics g){
         g.drawOval(k, 100, 100, 100);
        if(p==1){
            g.setColor(Color.DARK_GRAY);
            g.fillArc(k, 100, 100, 100, 0, 30);
            g.setColor(Color.DARK_GRAY);
            g.fillArc(k, 100, 100, 100, 60, 30);
            g.setColor(Color.DARK_GRAY);
            g.fillArc(k, 100, 100, 100, 120, 30);
            g.setColor(Color.DARK_GRAY);
            g.fillArc(k, 100, 100, 100, 180, 30);
            g.setColor(Color.DARK_GRAY);
            g.fillArc(k, 100, 100, 100, 240, 30);
            g.setColor(Color.DARK_GRAY);
            g.fillArc(k, 100, 100, 100, 300, 30);
            g.setColor(Color.DARK_GRAY);
            g.fillArc(k, 100, 100, 100, 360, 30);
           
        }
        if(p==0){
            g.setColor(Color.DARK_GRAY);
            g.fillArc(k, 100, 100, 100, 30, 30);
            g.setColor(Color.DARK_GRAY);
            g.fillArc(k, 100, 100, 100, 90, 30);
            g.setColor(Color.DARK_GRAY);
            g.fillArc(k, 100, 100, 100, 150, 30);
            g.setColor(Color.DARK_GRAY);
            g.fillArc(k, 100, 100, 100, 210, 30);
            g.setColor(Color.DARK_GRAY);
            g.fillArc(k, 100, 100, 100, 270, 30);
            g.setColor(Color.DARK_GRAY);
            g.fillArc(k, 100, 100, 100, 330, 30);
        }
    }
}
