import java.util.Scanner;

class demo
{
	int no,r,sum=0,temp;
	Scanner sc=new Scanner(System.in);
	
	void read()
	{
		System.out.println("enter no");
		no=sc.nextInt();
		temp=no;
	}
	
	void show()
	{
		sum=0;
		while(no>0)
		{
			r=no%10;
			sum=sum+r*r*r;
			no=no/10;
		}		
		if(temp==sum)
	   {
		System.out.println("Number is Armstrong");
   	}
	  else
	   {
	System.out.println("Number is not Armstrong");
	   }
	}
}
class armstrong
{
	public static void main(String[] args)
	{
		demo d1=new demo();
		d1.read();
		d1.show();
	}
}