import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Val {
	void add()
	{
	Pattern pattern = Pattern.compile("[a-zA_Z]{1, }");// for name
	Pattern pattern1 = Pattern.compile("[0-9]{10}");// for phone number
	Pattern pattern2 = Pattern.compile("[1-9]{1}[0-9]{9}");// for phone number second way
	Pattern pattern3 = Pattern.compile("\\d{10}");// for phone number third way
	Pattern pattern4 = Pattern.compile("[a-z]{1}[a-z0-9_.]{1,}@[a-z0-9]{1,10}.[a-zA-z]{2,}");// for email
	String gender;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter gender");
gender=sc.next().trim().toLowerCase();// validation
	Pattern pattern5 = Pattern.compile("[a-zA-Z]+");// city
	Pattern pattern6 = Pattern.compile("\\d+[.]{1}[0-9]{2}");//salary
	Matcher matcher=pattern.matcher(gender);
	if(matcher.matches())
	{
		System.out.println("success");
	}else
	{
		System.out.println("unsuccess");
	}
	
	
if(gender.equalsIgnoreCase("M")||gender.equalsIgnoreCase("Male"))
	{

	}else if(gender.equalsIgnoreCase("F")||gender.equalsIgnoreCase("female"))
	{

	}
	}
}
