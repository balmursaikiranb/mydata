package three.three;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateDifference {
String date1;
void dateDiff()
{
	DateTimeFormatter form=DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	Scanner sc=new Scanner(System.in);
	date1=sc.next();
	
	LocalDate today=LocalDate.now();
	LocalDate join=LocalDate.parse(date1,form);
	//LocalDate join1=LocalDate.parse(date1,form);
	Period diff=join.until(today);
	System.out.println("days"+diff.getDays());
	System.out.println("months"+diff.getMonths());
	System.out.println("years"+diff.getYears());
	sc.close();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateDifference d=new DateDifference();
		d.dateDiff();
	}

}
