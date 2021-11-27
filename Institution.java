/**
 *
 * @author Gowri Arunsha
 */
class Person
{
    String name;
    String emp_code;
    String phone;
    String dept;
    //constructor
    Person(String name,String emp_code,String phone,String dept)
    {
        this.name=name;
        this.emp_code=emp_code;
        this.phone=phone;
        this.dept=dept;
    }
    void retrieveData()
    {
        System.out.println("Name:"+name+"\nEmployee Code:"+this.emp_code+"\nPhone:"+this.phone+"\nDepartment:"+this.dept);
    }
    
}
class Ass_Pro extends Person
{
    String pos;
    String spec;
    Ass_Pro(String name,String emp_code,String phone,String dept,String spec)
    {
        super(name,emp_code,phone,dept);
        pos="Assistant Professor";
        this.spec=spec;
    }
    void retrieveData()
    {
        super.retrieveData();
        System.out.println("Position:"+this.pos+"\nSpec:"+this.spec);
    }
    
}

class Assos_Prof extends Person
{
    String pos;
    Assos_Prof(String name,String emp_code,String phone,String dept)
    {
        super(name,emp_code,phone,dept);
        pos="Associate Professor";
    }
    void retrieveData()
    {
        super.retrieveData();
        System.out.println("Position:"+this.pos);
    }
    
}
class Proff extends Person
{
    String pos;
    Proff(String name,String emp_code,String phone,String dept)
    {
        super(name,emp_code,phone,dept);
        pos="Professor";
    }
    void retrieveData()
    {
        super.retrieveData();
        System.out.println("Position:"+this.pos);
    }
    
}

public class Institution {
    public static void main(String args[])
    {
        Ass_Pro a1=new Ass_Pro("Reena Kumari","IT01","9098765455","IT","Data Science");
        Ass_Pro a2=new Ass_Pro("Pradeep Kumar","CS01","9098711455","CS","Cyber Security");
        Assos_Prof as1=new Assos_Prof("Gia Arunsha","ME87","1234567890","ME");
        Proff p1=new Proff("Sreedivya","IT99","0987654321","IT");
        Proff p2=new Proff("Usha Arun","CS22","9998887776","CS");
        
        a1.retrieveData();
        a2.retrieveData();
        as1.retrieveData();
        p1.retrieveData();
        p2.retrieveData();
    }
}
