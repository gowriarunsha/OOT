/*
Write a program in java to generate an abstract class A also class B inherits the class A. generate the object for
class B and display the text “call me from B”.
 */

/**
 *
 * @author Gowri Arunsha
 */
abstract class A {

public abstract void display();

}

public class B extends A
{
    public void display()
    {
        System.out.println("Calling from B a function defined in abstract A");
    }
    
    public static void main(String args[])
    {
        B b1=new B();
        b1.display();
    }
} 



