import java.util.Scanner;
class string
{
  public static void main(String[] args)
  {
    String first = "Hello";
    String second = "World";
    String third = "World";
    System.out.println("First :- " + first);
    System.out.println("Second :- " + second);     
    char ch=first.charAt(0);
    System.out.println("Character at :- "+ch);
    
    String upperStr=first.toUpperCase();
    System.out.println("Upper case is :- "+upperStr);
    
 
    String lowerStr=second.toLowerCase();
    System.out.println("Lower case is :- "+lowerStr);

     
    String join = first.concat(second);
    System.out.println("Join String :- " + join);

   
    int length = join.length();
    System.out.println("Length :- " + length);

 
    boolean result1 = first.equals(second);
    System.out.println("Strings first and second are equal :- " + result1);
    
    boolean result2 = second.equals(third);
    System.out.println("Strings second and third are equal :- " + result2);

  }
}
