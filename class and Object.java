import java.util.Scanner;
 class class1
    {
    	int Book_id;
    	String B_name;
    	float B_price;
    	void read()
    	{
    		Scanner s=new Scanner(System.in);
    		System.out.println("---------------------Enter The BOOK INFORMATION------------------ ");
    		System.out.print("Enter the Book ID = ");
    		Book_id=s.nextInt();
    		System.out.print("Enter the Book Name  = ");
    		B_name=s.next();
    		System.out.print("Enter the Book Price = ");
    		B_price=s.nextFloat();
    	}
        void show()
        {
        System.out.println("------------------------ The BOOK INFORMATION--------------------");
            System.out.println("ID of the Book is : " +Book_id);
            System.out.println("Name of the Book is :  "+B_name);
            System.out.println("Price of the Book is : "+B_price);
            
        }
    }
   class object	                   
    {
	public static void main(String[] args) 
	   {
	   	class1 c=new class1();
	   	c.read();
	   	c.show();
	    }
    }