class EmployeeDemo
{
public static void main(String args[])
{
Employee emp=new Employee();
emp.getLogin();
emp.empName=args[0];
emp.empSalary=Integer.parseInt(args[1]);
System.out.println("salary is "+emp.empSalary+" employee name is "+emp.empName);
}
}