package twentyeight.one;

import java.util.Scanner;

public class MyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee emp[]=new Employee[3];
/*emp[0]=new Employee();
emp[0].setEmpid(1234);
emp[0].setEmpname("sai");
emp[0].setEmpage(21);

emp[1]=new Employee();
emp[1].setEmpid(4567);
emp[1].setEmpname("kiran");
emp[1].setEmpage(22);

emp[2]=new Employee();
emp[2].setEmpid(8910);
emp[2].setEmpname("balmur");
emp[2].setEmpage(23);
*/
emp[0]=new Employee();
emp[2]=new Employee();
emp[2]=new Employee();
Scanner sc=new Scanner(System.in);
for (int i = 0; i < emp.length; i++) {
	System.out.println("enter the employee id of:"+i);
	int empi=sc.nextInt();
	emp[i].setEmpid(empi);
	System.out.println("enter the employee name of:"+i);
	String empn=sc.next();
	emp[i].setEmpname(empn);
	System.out.println("enter the employee age of:"+i);
	int empa=sc.nextInt();
	emp[i].setEmpage(empa);
}

for (int i = 0; i < emp.length; i++) {
	System.out.println("details of employee number"+"["+i+"]\t");
	System.out.print(emp[i].getEmpid()+"\t");
	System.out.print(emp[i].getEmpname()+"\t");
	System.out.print(emp[i].getEmpage()+"\n");
}
	}

}
