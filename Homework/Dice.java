
public class Dice {
	private int RollNum;
	public Dice(int roll){
		RollNum=roll;
	}
	public int roll(){
		int total = RollNum*6;
		int randomRoll = 1+ (int)(Math.random()*total);
		return randomRoll;
	}
}
