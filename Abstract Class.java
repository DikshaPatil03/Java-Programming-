abstract class A
{
	int a,b;
	void read()
	{
		a=100;
		b=200;
	}
 public abstract void show();
}
class B extends A
{
	public void show()
	{
		System.out.println(a*b);
	}
}
public class Main {
	public static void main(String[] args) {
		B a=new B();
		a.read();
		a.show();
	}
}