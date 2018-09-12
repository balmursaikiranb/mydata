package three.seven;

import java.util.Scanner;

public class RegisteringDetails {
String username;

 void getUsername()
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter the username with _job:");
	 username=sc.next();
	 validate(username);
 }
  void validate(String username)
 {
	if(username.length()>=12)
	{
		if(username.contains("_job"))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}
	else
	{
		System.out.println("please enter minimum of 8 charecters in your name and append _job at end of your name");
		getUsername();
	}

 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegisteringDetails rd=new RegisteringDetails();
		rd.getUsername();
	}

}
