/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gowri Arunsha
 */
class extendedThread extends Thread
{
    @Override
    public void run()
    {
    
        System.out.println("This the extended thread");
    }
} 
class interfaceThread implements Runnable
{
    @Override
    public void run()
    {
    for(int i=0;i<10;i++)
        System.out.println("This the interface thread");
    }
}
public class pgm15
{
    public static void main(String args[])
    {
        extendedThread t1=new extendedThread();
        Thread t2=new Thread(new interfaceThread());
        t1.start();
        t2.start();
    }
}