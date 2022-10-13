import java.util.Scanner;
class demo
{
	int a,b,c;
	Scanner s=new Scanner(System.in);
	void get()
	{
	System.out.println("Enter the value of A =" );       a=s.nextInt();
	System.out.println("Enter the Value of B =");
	b=s.nextInt();
	}
}
class demo_1 extends demo
{
 void show()
{ 
    c=a+b;
	{
	System.out.println("Addition of A and B ="+c);
	}
}
}
public class Main
{
	public static void main(String[] args) 
	{
		demo_1 m=new demo_1();
		m.get();
		m.show();
		
	}
}