public class CustomExceptionsDemo{
	
	private double balance;
	private double needs;
		
	public static void main(String[] args){		
		CustomExceptionsDemo cObj = new CustomExceptionsDemo();
		cObj.funcF();
	}
	
	public void funcF(){
		try{
			System.out.println("Depositing amount: 500");
			this.depositBalance(500);
			
			System.out.println("Withdrawing amount: 100 ");
			this.funcG(100);
			
			System.out.println("Withdrawing amount: 700");
			this.funcG(700); // Here it should throw exception
			
		}catch(InsufficientBalanceException e){
			System.out.println("Sorry, You can't withdraw this amount because you have "+e.getAmount()+" less !");
		}
	}
	public void depositBalance(double bal){
		this.balance += bal;
		System.out.println("Deposit Success !");
	}
	public void funcG(double amt) throws InsufficientBalanceException{	
		if(amt <= balance){
			balance -= amt;
			System.out.println("Withdraw Success !");			
		}else{
			needs = amt - balance;
			throw new InsufficientBalanceException(needs);
		}
	}
}
class InsufficientBalanceException extends Exception{
	private double amount;
	
	public InsufficientBalanceException(double amt){
		this.amount = amt;
	}
	public double getAmount(){
		return this.amount;
	}
} 
