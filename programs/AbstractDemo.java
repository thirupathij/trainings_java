abstract class EmpCls{
	int empId;
	String empName;
	String empDesg;
	
	public EmpCls(int id, String name, String desg){
		this.empId = id;
		this.empName = name;
		this.empDesg = desg;
	}
	public abstract void getEmpDetails();
}
public class AbstractDemo extends EmpCls{
	public AbstractDemo(){
		super(101, "Thirupathi Jarajapu", "Staff Software Engineer");
	}
	public void getEmpDetails(){
		System.out.println("Emp Details: "+this.empId+" "+this.empName+" "+this.empDesg);
	}
	public static void main(String[] args){
		AbstractDemo empObj = new AbstractDemo();
		empObj.getEmpDetails();
	}
}