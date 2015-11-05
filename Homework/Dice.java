
public class Dice {
	public Dice(){
		
	}
	private int RollNum,Value;
	
	public void Throw(){
		RollNum = 1 + (int)(Math.random()*6);
	}
	public void Throw(int bounces){
		int i =0;
		int Roll = 0;
		int Total = 0;
		while(i<bounces){
		Roll= 1 + (int)(Math.random()*6);
		Total = Total + Roll;
		i++;
		}
		Value = Total;
		RollNum = Total/bounces;
		
	}
	public int Test2(){
		return Value;
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
