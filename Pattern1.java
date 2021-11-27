/*
Try to print these two figures on the screen using println and least number of strings

 *******
  *****
   ***
    *
   ***
  *****
 *******


**********
*        *
*        *
*        *
**********
 */

/**
 *
 * @author Gowri Arunsha
 */
import java.io.*;
public class Pattern1 {
    
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("PATTERN 1");
        System.out.println("Input n:");
        int n=Integer.parseInt(br.readLine());
    
    //pattern 1
    for(int i=1-n;i<=n-1;i++)
    {
        //printing stars
        
        for(int j=0;j<(Math.abs(i))*2+1;j++)
            System.out.print("*");
        
        System.out.println();
    }
    
    //pattern 2
    
    System.out.println("PATTERN 2");
    System.out.println("Input n:");
    n=Integer.parseInt(br.readLine());
    int A[][]=new int[n][2*n];
    
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<2*n;j++)
        {
            if(i==0||i==n-1||j==0||j==2*n-1)
                A[i][j]=1;
            else
                A[i][j]=0;
        }
    }
    
    
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<2*n;j++)
        {
            if(A[i][j]==1)
                System.out.print("*");
            else
                System.out.print(" ");
        }
        System.out.println();
    }
    }
    
}
