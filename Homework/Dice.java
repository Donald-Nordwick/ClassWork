
public class Dice {
	public Dice(){
		
	}
	
	private int Value,Test; //RollNum(keeps track of number dice rolled), Value(Keeps track of average Rolled)
	private static int RollNum;
	public Dice(int bounces){
		int track,sum = 0;
		Dice roll = new Dice();
		
		for (int i = 0; i<bounces; i++){
			roll.Throw();
			track = roll.Value();
			sum = sum+track;
		}
		RollNum = sum/bounces;
		Test = sum;
	}
	public void Throw(){
		RollNum = 1 + (int)(Math.random()*6);
	}
	public void Throw(int bounces){
		
		int Roll = 0;
		int Total = 0;
		for (int i=0;i< bounces;i++){
		Roll= 1 + (int)(Math.random()*6);
		Total = Total + Roll;
		
		}
		Value = Total;
		Test = Total;
		RollNum = Total/bounces;
		
	}
	public int Test2(){
		return Test;
	}
	public int Value(){
		return RollNum;
	}
	
	public int roll(){
		int total = RollNum*6;
		int randomRoll = 1+ (int)(Math.random()*total);
		return randomRoll;
	}
	public static int OneThrow(){
		RollNum = 1+ (int)(Math.random()*6);
		return RollNum;
	}
	
}
