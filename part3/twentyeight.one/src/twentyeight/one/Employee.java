package twentyeight.one;

public class Employee {
int empid;
String empname;
@Override
public String toString() {
	return "Employee [empid=" + empid + ", empname=" + empname + ", empage=" + empage + "]";
}
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public int getEmpage() {
	return empage;
}
public void setEmpage(int empage) {
	this.empage = empage;
}
int empage;
}
