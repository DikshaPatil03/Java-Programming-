import java.util.*;
class Student
{
    int rollNo;
    String name;    
	static String college="RCPIMRD";
   Student(int rollNo,String name)
	{
	    this.rollNo=rollNo;
		this.name=name;
	}
   void display()
   {
	System.out.println(rollNo+" "+name+" "+college);
   }
   public static void main(String args[])
   {
   Student e1=new Student(1,"Ram");
    e1.display();
  Student e2=new Student(2,"shyam");
    e2.display();
   }
}