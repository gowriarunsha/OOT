/*
Question:
Implement  a java class having overloaded methods to calculate the area of a square
rectangle and circle.
 */

/**
 *
 * @author Gowri Arunsha
 */
import java.io.*;
public class Area {
    public static int calc_area(int a)
    {
        return a*a;
    }
    public static int calc_area(int a,int b)
    {
        return a*b;
    }
    public static double calc_area(double r)
    {
        return (22/7)*r*r;
    }
    
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a;
        //menu
        System.out.println("\t\tMENU\n1.Square\n2.Rectangle\n3.Circle\n0. Exit");
        int ch=-1;
        do
        {
            System.out.println("Input choice:");
            ch=Integer.parseInt(br.readLine());
            switch(ch)
            {
                case 1:
                    System.out.println("Input side length:");
                    a=Integer.parseInt(br.readLine());
                    System.out.println("Area of square="+calc_area(a));
                    break;
                case 2:
                    System.out.println("Input length and breadth:");
                    a=Integer.parseInt(br.readLine());
                    int b=Integer.parseInt(br.readLine());
                    System.out.println("Area of rectangle="+calc_area(a,b));
                    break;
                case 3:
                    System.out.println("Input radius:");
                    double r=Double.parseDouble(br.readLine());
                    System.out.println("Area of circle="+calc_area(r));
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Error: Invalid choice!!");
            }
        }while(ch!=0);
    }
}
