	import java.util.Scanner;
class demo
{
	int n,s=0,c,r;
	Scanner sc=new Scanner(System.in);
	void read()
	{
		System.out.print("enyer any number");
		n=sc.nextInt();
	}
	void display()
	{
		c=n;
		while(n>0)
		{
			r=n%10;
			s=(s*10)+r;
			n=n/10;
		}
		if(c==s)
		System.out.print("palindroen number");
		else
		System.out.print("not palindrome number");
	}
}


public class Main {
	public static void main(String[] args) {
		demo d1=new demo();
		d1.read();
		d1.display();
		
	}
}
