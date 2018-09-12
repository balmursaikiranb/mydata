class CalculatorDemo
{
public static void main(String args[])
{
Calculator c=new Calculator();
c.a=Integer.parseInt(args[0]);
c.b=Integer.parseInt(args[1]);
System.out.println("addition is"+(c.a+c.b));
System.out.println("subtraction is"+(c.a-c.b));
System.out.println("multiplication is"+(c.a*c.b));
}
}