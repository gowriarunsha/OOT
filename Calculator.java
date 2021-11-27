/*
Write a Java program to perform Calculator operations.
1.addition
2.Subtraction
3.multiplication
4.Division
5.square
6.square root
7.factorial
8.power/ exponent of a number
 */

/**
 *
 * @author Gowri Arunsha
 */
import java.io.*;
public class Calculator {
    public static int addition(int a,int b)
    {
        return a+b;
    }
    public static int subtraction(int a,int b)
    {
        return a-b;
    }
    public static int multiplication(int a,int b)
    {
        return a*b;
    }
    public static double division(double a,double b)
    {
        return a/b;
    }
    public static double sqaure(double a)
    {
        return a*a;
    }
    public static double sqrt(double a)
    {
        return Math.pow(a,0.5);
    }
    public static int fact(int a)
    {
        int fact=1;
        for(int i=1;i<=a;i++)
        {
            fact*=i;
        }
        return fact;
    }
    public static double exp(int a,int b)
    {
        return Math.pow(a,b);
    }
    
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\t\tMENU\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Divison\n5.Square\n6.Square root\n7.Factorial\n8.Exponent0. Exit");
        int ch=-1;
        do
        {
            System.out.println("Input choice:");
            ch=Integer.parseInt(br.readLine());
            int a,b;
            switch(ch)
            {
                case 1:
                    System.out.println("Input numbers to be added:");
                    a=Integer.parseInt(br.readLine());
                    b=Integer.parseInt(br.readLine());
                    System.out.println("Sum="+addition(a,b));
                    break;
                case 2:
                    System.out.println("Input numbers to be subtracted:");
                    a=Integer.parseInt(br.readLine());
                    b=Integer.parseInt(br.readLine());
                    System.out.println("Difference="+subtraction(a,b));
                    break;
                case 3:
                    System.out.println("Input numbers to be multiplied:");
                    a=Integer.parseInt(br.readLine());
                    b=Integer.parseInt(br.readLine());
                    System.out.println("Product="+multiplication(a,b));
                    break;
                case 4:
                    System.out.println("Input numbers to be divided:");
                    double c=Double.parseDouble(br.readLine());
                    double d=Double.parseDouble(br.readLine());
                    System.out.println("Quotient="+division(c,d));
                    break;
                case 5:
                    System.out.println("Input number to be squared:");
                    a=Integer.parseInt(br.readLine());
                    System.out.println("Square="+sqaure(a));
                    break;
                case 6:
                    System.out.println("Input number to find sqaure root:");
                    double n=Double.parseDouble(br.readLine());
                    System.out.println("Square root="+sqrt(n));
                    break;
                case 7:
                    System.out.println("Input number to find factorial:");
                    a=Integer.parseInt(br.readLine());
                    System.out.println("Factorial="+fact(a));
                    break;
                case 8:
                    System.out.println("Input number and exponent:");
                    a=Integer.parseInt(br.readLine());
                    b=Integer.parseInt(br.readLine());
                    System.out.println("Answer="+exp(a,b));
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
