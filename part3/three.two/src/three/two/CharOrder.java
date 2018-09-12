package three.two;

import java.util.Scanner;

public class CharOrder {
String str;
boolean checkString()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string:");
	str=sc.next();
	for(int i=0;i<str.length()-1;i++)
	{
		if((str.charAt(i))>(str.charAt(i+1)))
		{
			return false;
		}
		
	}
	return true;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
CharOrder co=new CharOrder();
System.out.println(co.checkString());
	}

}
