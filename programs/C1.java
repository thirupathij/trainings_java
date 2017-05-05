public class C1{
	public static void main(String[] args){
		System.out.println("eQuals Override Demo: ");
		User usrObj1 = new User("Thirupathi", "Jarajapu");
		User usrObj2 = new User("Thirupathi", "Jarajapu");
		User usrObj3 = new User("Thirupathi", "Jarajapu");
		
		System.out.println("Reflexive =>"+usrObj1.equals(usrObj1));
		System.out.println("Symmetric => x.equals(y) :"+usrObj1.equals(usrObj2)+" y.equals(x) :"+usrObj2.equals(usrObj1));
		System.out.println("Transitive => x.equals(y) :"+usrObj1.equals(usrObj2)+" y.equals(z) :"+usrObj2.equals(usrObj3)+" x.equals(z) :"+usrObj1.equals(usrObj3));
		System.out.println("x is Not Null =>"+usrObj1.equals(null));
		
		User x = new User("Raju", "Hey");
		User y = new User("Hello", "Hi");
		
		System.out.println("Consistent =>x.equals(y): "+x.equals(y)+" y.equals(x): "+y.equals(x));
		
		System.out.println("hasCode Override Demo: ");
		System.out.println("x.hasCode() calling 2 times to see the same result => 1. "+x.hashCode()+" 2. "+x.hashCode());
		System.out.println("Checking [user1Obj hasCode == user2Obj hasCode] since user1Obj and user2Obj has same data => "+(usrObj1.hashCode() == usrObj2.hashCode()) );
		System.out.println("Checking [x hashCode == y hashCode] since x and y has different user data => "+(x.hashCode() == y.hashCode()) );
		System.out.println("x.hasCode() and y.hasCode() => 1. "+x.hashCode()+" 2. "+y.hashCode());
		
		
	}
}
class User{
	public String fName, lName;
	
	public User(String fN, String lN){
		this.fName = fN;
		this.lName = lN;
	}
	
	@Override
	public boolean equals(Object o){
		if(o == null){
			return false;
		}
		
		if(o == this){
			return true;
		}
		
		if(!(o instanceof User)){
			return false;
		}
		
		User usr = (User) o;		
		return fName == usr.fName && lName == usr.lName;		
	}
	
	@Override
	public int hashCode(){
		final int prime = 31;		
		int result = 1;
		result = prime * result + (fName == null ? 0 : fName.hashCode());
		result = prime * result + (lName == null ? 0 : lName.hashCode());
		return result;
	}
	
}