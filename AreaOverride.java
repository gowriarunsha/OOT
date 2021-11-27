/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gowri Arunsha
 */
import java.util.*;
class Figure{
    void area(int a,int b)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("1.Rectangle\n2.Triangle\nInput choice:");
        int ch=sc.nextInt();
        if(ch==1)
            System.out.println("Area of rectangle="+(a*b));
        else if(ch==2)
            System.out.println("Area of triangle="+((a*b)/2.0));
        else
            System.out.println("Invalid choice!");
    }
}
class Rectangle extends Figure{
    
    void area(int a,int b)
    {
        System.out.println("Area of rectangle="+(a*b));
    }
    
}
class Triangle extends Figure{
    void area(int a,int b)
    {
        System.out.println("Area of triangle="+((a*b)/2.0));
    }
    
}
public class AreaOverride {
    public static void main(String args[])
    {
        Figure f1=new Figure();
        Rectangle r1=new Rectangle();
        Triangle t1=new Triangle();
        f1.area(10,20);
        r1.area(10,20);
        t1.area(10,20);
    }
    
}
