/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gowri Arunsha
 */
import java.io.*;
public class BubbleSort {
    
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input n:");
        int n=Integer.parseInt(br.readLine());
        int A[]=new int[n];
        
        System.out.println("input elements in array:");
        for(int i=0;i<n;i++)
        {
            A[i]=Integer.parseInt(br.readLine());
        }
    
        //bubblesort
        int temp;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(A[j]>A[j+1]) //ascending
                {
                    temp=A[j];
                    A[j]=A[j+1];
                    A[j+1]=temp;
                }
            }
        }
        //display
        System.out.println("sorted Array:");
        for(int i=0;i<n;i++)
        {
            System.out.print(A[i]+"\t");
        }
        System.out.println();
    }
    
}
