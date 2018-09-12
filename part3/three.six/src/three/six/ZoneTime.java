package three.six;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class ZoneTime {
String zone;
void ZoneTimeCheck()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter zone: ");
	zone=sc.next();
	ZonedDateTime zone1=ZonedDateTime.now(ZoneId.of(zone));
	System.out.println(zone1);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ZoneTime z=new ZoneTime();
z.ZoneTimeCheck();
	}

}
