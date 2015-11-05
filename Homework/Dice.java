
public class Dice {
	public Dice(){
		
	}
	private int RollNum;
	
	public void Throw(){
		RollNum = 1 + (int)(Math.random()*6);
	}
	public int Value(){
		return RollNum;
	}
	public Dice(int roll){
		RollNum=roll;
	}
	public int roll(){
		int total = RollNum*6;
		int randomRoll = 1+ (int)(Math.random()*total);
		return randomRoll;
	}
}
