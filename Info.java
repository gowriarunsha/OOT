import java.io.*;
public class Info
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String name[]=new String[5];
		String mail[]=new String[5];
		String code[]=new String[5];
		long phone[]=new long[5];
		for(int i=0;i<5;i++)
		{
			System.out.println("Input name, mail, employee code and phone number: ");
			name[i]=br.readLine();
			mail[i]=br.readLine();
			code[i]=br.readLine();
			phone[i]=Long.parseLong(br.readLine());
		}

		//display 
		System.out.println("NAME\t\t\tMAIL-ID\t\t\tEMPLOYEE-CODE\t\t\tPHONE NUMBER");
		for(int i=0;i<5;i++)
		{
			System.out.println(name[i]+"\t\t"+mail[i]+"\t\t\t"+code[i]+"\t\t\t\t"+phone[i]);
		}
	}
}
