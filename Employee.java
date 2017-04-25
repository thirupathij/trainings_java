public class Employee{
	String empName;
	int empAge;
	String empDesg;
	double empSal;
	
	public Employee(String name, int age, String desg, double sal){
		System.out.println("Calling constructor---->");
		empName = name;
		empAge = age;
		empDesg = desg;
		empSal = sal;
	}
	
	public void getEmployeeDetails(){
		System.out.println("Name: "+empName+"\n");
		System.out.println("Age: "+empAge+"\n");
		System.out.println("Designation: "+empDesg+"\n");
		System.out.println("Salary: "+empSal+"\n");		
	}
}