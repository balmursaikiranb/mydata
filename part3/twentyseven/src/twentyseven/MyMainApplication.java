package twentyseven;

;

public class MyMainApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee emp=new Employee();

try {
	emp.getData(10,0);
}
catch(ArithmeticException ae)
{
	System.out.println(ae.getMessage());
}
	}

}
