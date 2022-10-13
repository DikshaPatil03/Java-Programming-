class outer
{
class inner1
{
public void show()
{
System.out.println("In a nested class method");
}
}
}
class inner
{
public static void main(String args[])
{
outer.inner1 in=new outer().new inner1();
in.show();
}
}