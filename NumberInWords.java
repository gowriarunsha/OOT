/*
Question:
int a_number=1; // (range: 1 to 5 including both)

Print the value of a_number in word. For example, it should
print “Four” if a_number
contains 4.
 */

/**
 *
 * @author Gowri Arunsha
 */
import java.io.*;
public class NumberInWords {
    
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input number in range 1 to 5:");
        int n=Integer.parseInt(br.readLine());
        String A[]=new String[]{"One","Two","Three","Four","Five"};
        
        System.out.println("Number in words:"+A[n-1]);
        
    }
    
}
