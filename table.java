import java.util.Scanner;
class table
 {
 	int i,no;
 Scanner sc=new Scanner(System.in);
 void get()
 {
 	System.out.println("Enter the Number");
 	no=sc.nextInt();
 }
 void display()
 {
 	for(i=1;i<10;i++)
 	{
 	System.out.println(i*no);
 }
}}
 class main
 {
	public static void main(String[] args)
	 {
		table n=new table();
		n.get();
		n.display();
	}
}