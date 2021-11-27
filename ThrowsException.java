/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gowri Arunsha
 */
public class ThrowsException {
    public static void main(String args[])
    {
        try{
            fun();
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception occurs");
//            throw e;
        }
        
    }
    static void fun()throws ArithmeticException
    {
        int n=9/0;
    }
}