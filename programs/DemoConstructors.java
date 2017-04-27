public class DemoConstructors{
	public static void main(String[] args){
		Employee empObj = new Employee("Thirupathi", 31);
		System.out.println("getting details with ins===> Name :"+empObj.name+" Age: "+empObj.age);
		System.out.println("Display Details from getDetails method:");
		empObj.getDetails();
	}
}
class Employee{
	String name;
	int age;
	Employee(String nm, int ag){
		name = nm;
		age = ag;
	}
	public void getDetails(){
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
	}
}