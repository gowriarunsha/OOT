
/*
Question:
Write a program to illustrate multilevel hierarchy, where Box is the super class and  the subclass
BoxWeight is used as a superclass to create the subclass called Shipment. Shipment inherits
all of the traits of BoxWeight and Box, and adds a field called cost, which holds the cost of
shipping such a parcel.
 */

/**
 *
 * @author Gowri Arunsha
 */
class Box {
    String pkgno;   //package number
    public Box(String pkgno)   //constructor
    {
        this.pkgno=pkgno;
    }  
}
class BoxWeight extends Box{
    int weight;
    public BoxWeight(int weight,String pkgno)      //constructor
    {
        super(pkgno);
        this.weight=weight;
    }  
}
public class Shipment extends BoxWeight{
    int cost;
    public Shipment(int cost,int weight,String pkgno)
    {
        super(weight,pkgno);
        this.cost=cost;
    }
    public void display()
    {
        System.out.println("Package Number:"+pkgno+"\nCost: Rs."+cost+"\nWeight:"+weight+"kg");
    }
    public static void main(String args[])
    {
        Shipment s1=new Shipment(10,200,"ITEM_001");
        s1.display();
    }
}

