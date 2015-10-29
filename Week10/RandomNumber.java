
public class RandomNumber 
{
	private int LowNumber;
	private int HighNumber;
	public void setLowNumber(int num){
		LowNumber = num;
	}
	public int getLowNumber()
	{
		return LowNumber;
	}
	public void setHighNumber(int num){
		HighNumber = num;
	}
	public int getHighNumber()
	{
		return HighNumber;
	}
	public int RandomNumber(int num)
	{
		
		int RandomNumber= 1 + (int) (Math.random()*num);
		return RandomNumber;
	}
	public int RandomNumber(int high, int low)
	{
		
		int RandomNumber= low +  (int) (Math.random()*(high-low));
		return RandomNumber;
	}
	public int RandomNumber()
	{
		
		int RandomNumber= 1 + (int) (Math.random()*10);
		return RandomNumber;
	}
	public int Random_Number()
	{
		int RandomNumber= getLowNumber() + (int) (Math.random()*(getHighNumber() - getLowNumber()));
		return RandomNumber;
	}
}
