/*
Question:
Find factorial of a number using recursion
 */

/**
 *
 * @author Gowri Arunsha
 */
import java.io.*;
public class Factorial {
    
    static int fact(int n)
    {
        if(n==0 ||n==1)
            return 1;
        else
            return n*fact(n-1);
    }
    
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input n:");
        int n=Integer.parseInt(br.readLine());
        System.out.println("Factorial:"+fact(n));
    }
    
}
