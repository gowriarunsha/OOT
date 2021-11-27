/*
Write a program to create a class named SHAPE. In this class have 3 subclass CIRCLE,TRIANGLE,SQUARE  each class has two member functions named Draw() and Erase()
 */

/**
 *
 * @author Gowri Arunsha
 */
public class SHAPES {
    
    public class CIRCLE
    {
        public void Draw()
        {
            System.out.println("Inside draw function of CIRCLE...");
        }
        public void Erase()
        {
            System.out.println("Inside erase function of CIRCLE...");
        }
    }
    
    public class TRIANGLE
    {
        public void Draw()
        {
            System.out.println("Inside draw function of TRIANGLE...");
        }
        public void Erase()
        {
            System.out.println("Inside erase function of TRIANGLE...");
        }
    }
    
    public class SQUARE
    {
        public void Draw()
        {
            System.out.println("Inside draw function of SQUARE...");
        }
        public void Erase()
        {
            System.out.println("Inside erase function of SQUARE...");
        }
    }
    
    public static void main(String args[])
    {
        SHAPES s=new SHAPES();
        SHAPES.CIRCLE c1=s.new CIRCLE();
        SHAPES.SQUARE s1=s.new SQUARE();
        SHAPES.TRIANGLE t1=s.new TRIANGLE();
        
        c1.Draw();
        c1.Erase();
        s1.Draw();
        s1.Erase();
        t1.Draw();
        t1.Erase();
        
    }
}
