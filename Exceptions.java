/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
import java.util.*;




//creating new exception class myException


// insert code




public class Exceptions {
    
    public static void main(String args[])

    {
        Scanner sc=new Scanner(System.in);
        //arithmetic exception
        try{
            throw new ArithmeticException("Adwaid");        //manually throws an exception
//            int n=9/0;
        }
        catch(ArithmeticException e)
        {
            System.out.println("ArithmetcException occurs");
        }
        finally{
            System.out.println("rest of code");
        }
        System.out.println("rest of code");
        //number format
        
        try{
            int num=Integer.parseInt(sc.nextLine());

        }
        catch(NumberFormatException e)
        {
            System.out.println("NumberFormatException occurs");
        }
        finally{
            System.out.println("rest of code");
        }
        //null pointer
        String s=null;
        try{
            System.out.println(s.length());
        }
        catch(NullPointerException e)
        {
            System.out.println("NullPointerException occurs");
        }
        finally{
            System.out.println("rest of code");
        }
        //array index out of bounds 
        int A[]=new int[5];
        try{
            A[5]=4;
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array Index out of bounds exception occurs");
        }
        finally{
            System.out.println("rest of code");
        }
    }
}