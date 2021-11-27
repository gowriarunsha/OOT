/*
Find sum of two variables by passing classes as parameters
 */

/**
 *
 * @author Gowri Arunsha
 */
class C{
    int x;
    C(int x)        //parameterized
    {
        this.x=x;
    }
    C()         //non parameterised
    {
        this.x=0;
    }
    void sum(C n1,C n2)
    {
        this.x= n1.x+n2.x;
    }
}
public class SumusingClassArguments {
    public static void main(String args[])
    {
        C n1=new C(3);
        C n2=new C(5);
        C res=new C();
        res.sum(n1,n2);
        
        System.out.println("Number 1:"+n1.x+"\nNumber 2:"+n2.x+"\nSum="+res.x);
    }
}
