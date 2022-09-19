package basicconcepts;

public class MethodOverloading {

	public void empID(String name) {
		System.out.println("Emp name is " + name);	
	}
	
	public void empID(String companyname, int salary, long mobilenumber) {
		System.out.println("Emp companyname is " + companyname );
		System.out.println("Emp salary is " + salary);
		System.out.println("Emp mobilenumber is " + mobilenumber);
	}
	public void empID(float height) {
		System.out.println("Emp height is " + height);
	}

	public static void main(String[] args) {
		
		MethodOverloading emp=new MethodOverloading();
		emp.empID("Manikandan");
		emp.empID("Global", 10000, 7373318402l);
		emp.empID(168.43f);
		
	}
}
