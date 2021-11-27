/*
Question:
Write a program that uses two arrays of size 5. One string array for storing names of students and one int array
for storing marks obtained by the students. Assign values to the elements in
the arrays. Print names and marks of students who have scored more than 35
marks.
 */

/**
 *
 * @author Gowri Arunsha
 */
import java.io.*;
public class StudentMarks1 {
    
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String names[]=new String[5];
        int marks[]=new int[5];
        //inputting names and marks
        System.out.println("Input names and marks of students:");
        for(int i=0;i<5;i++)
        {
            names[i]=br.readLine();
            marks[i]=Integer.parseInt(br.readLine());
        }
        //printing marks above 35
        System.out.println("List of students who scored more than 35:");
        for(int i=0;i<5;i++)
        {
            if(marks[i]>35)
                System.out.println(names[i]+"\t"+marks[i]);
        }
    } 
}
