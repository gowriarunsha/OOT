import java.io.*;
public class Stack
{
	int A[];
	int top;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public Stack()
	{
		A=new int[50];
		top=-1;
	}
	public void main(String args[])throws IOException
	{
		
		System.out.println("\t\t\tMENU\n1. push\n2. pop\n3. display\n0. exit\n");

		int ch;
		do{
			System.out.println("Input choice:");
			ch=Integer.parseInt(br.readLine());

		switch(ch)
		{

			case 1:System.out.println("Input element to be pushed:");
				int x=Integer.parseInt(br.readLine());
				push(x);
				break;
			case 2:pop();
				break;
			case 3:display();
				break;
			case 0:System.out.println("Exiting program...");
				System.exit(0);
			default:System.out.println("Invalid choice!!");

		}
		}while(ch!=0);
	}
	public void pop()
	{
		if(top==-1)
		{
			System.out.println("Empty stack");
			return;
		}
		else
		{
			return top--;
		}
	}
	public void push(int x)
	{
		if(top==49)
		{
			System.out.println("Overflow");
			return;
		}
		else
		{
			top++;
			A[top]=x;
		}
		
	}
	public void display()
	{
		System.out.println("Displaying stack...");

		for(int i=0;i<=top;i++)
		{
			System.out.print(A[i]+"\t");
		}
	}

}


