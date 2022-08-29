import java.util.Scanner;
class FactorialExample{  
public static void main(String args[])
{  
int i,fact=1,no;
Scanner sc=new Scanner(System.in);
System.out.print("Enter number= ");
 no=sc.nextInt();
  for(i=1;i<=no;i++){    
      fact=fact*i;    
  }    
  System.out.println("Factorial of "+no+" is: "+fact);    
 }  
}