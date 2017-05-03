public class InterfaceDemo implements Game{
	public static void main(String[] args){
		System.out.println("Starting in main method: ");
		//Creating instance for InterfaceDemo
		InterfaceDemo obj = new InterfaceDemo();
		obj.passInterFaceByRefCricket(obj);
		obj.passInterFaceByRefKabaddi(obj);
		obj.passInterFaceByRefVolleyball(obj);
		obj.passInterFaceByRefGame(obj);
	}	
	
	public void diplayGames(){
		System.out.println("Displaying List Of Games Summary from diplayGames(Games Interface) method !");
	}
	
	
	//Implementing Methods of Cricket
	public void showScore(){
		System.out.println("Displaying Score from showScore(Cricket Interface) method !");
	}
	public void showPlayers(){
		System.out.println("Displaying Players List from showPlayers(Cricket Interface) method !");
	}
	
	//Implementing Methods of Kabaddi
	public void displayMatches(){
		System.out.println("Displaying All Matches from displayMatches(Kabaddi Interface) method !");
	}
	public void showPlayTime(){
		System.out.println("Displaying Play time from showPlayTime(Kabaddi Interface) method !");
	}
	
	//Implementing Methods of Volleyball
	public void showTimeOut(){
		System.out.println("Displaying Timeout from showTimeOut(Volleyball Interface) method !");
	}
	public void displayPlayerRecord(){
		System.out.println("Displaying Plyer Details from displayPlayerRecord(Volleyball Interface) method !");
	}
	
	//Implementing Methods of Other methods specific to this class
	public void passInterFaceByRefCricket(Cricket cr){
		cr.showScore();
		cr.showPlayers();
	}
	public void passInterFaceByRefKabaddi(Kabaddi kb){
		kb.displayMatches();
		kb.showPlayTime();
	}
	public void passInterFaceByRefVolleyball(Volleyball vb){
		vb.displayPlayerRecord();
		vb.showTimeOut();
	}
	public void passInterFaceByRefGame(Game gm){
		gm.diplayGames();
		gm.displayMatches();
		gm.displayPlayerRecord();
		gm.showPlayers();
		gm.showPlayTime();
		gm.showScore();
		gm.showTimeOut();
	}
	
}

interface Cricket{
	public void showScore();
	public void showPlayers();
}
interface Kabaddi{
	public void showPlayTime();
	public void displayMatches();
}
interface Volleyball{
	public void showTimeOut();
	public void displayPlayerRecord();
}

interface Game extends Cricket, Kabaddi, Volleyball{
	public void diplayGames();	
}