/*
Question: Write implementation of stack.
 */

/**
 *
 * @author Gowri Arunsha
 */
import java.io.*;
public class Stack {
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input max:");
        int n=Integer.parseInt(br.readLine());
        int A[]=new int[n];
        int top=-1;
        int ch=-1;
        //menu insert pop top exit
        System.out.println("\t\tMENU\n1.push\n2.pop\n3.top\n4.display\n0.exit");

        do{
            System.out.println("Input your choice:");
            ch=Integer.parseInt(br.readLine());
            switch(ch)
            {
                case 1:
                    System.out.println("Input element to be pushed:");
                    int item=Integer.parseInt(br.readLine());
                    top=push(A,top,item,n);
                    break;
                case 2:
                    top=pop(A,top);
                    break;
                case 3:
                    top(A,top);
                    break;
                case 4:
                    display(A,top);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Error: Invalid choice!");
                    
            }
            
        }while(ch!=0);
        
        
    }
    
    public static int push(int[] A,int top,int item,int n)
    {
        if(top==n-1)
        {
            System.out.println("Error: Stack is full!");
            return top;
        }
        A[++top]=item;
        return top;
        
    }
    
    public static int pop(int[] A,int top)
    {
        //if empty 
        if(top==-1)
        {
            System.out.println("Error:Stack Empty!");
            return top;
        }
        System.out.println("Element Popped:"+A[top--]);
        return top;
    }
    
    public static void top(int[] A,int top)
    {
        System.out.println("Top:"+A[top]);
    }
    
    public static void display(int[] A, int top)
    {
        for(int i=0;i<=top;i++)
        {
            System.out.print(A[i]+"\t");
        }
        System.out.println();
    }
}
