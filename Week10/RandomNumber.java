
public class RandomNumber 
{
	/*In order to make the previous labs that don't rely on constructors 
	 * work, comment out the constructor on lines 9-12*/
	/*In order to make Lab 6 work comment out  the constructor on lines 9-12*/
	private int LowNumber;
	private int HighNumber;
	/*public RandomNumber(int High){
		LowNumber = High;
	}*/
	public RandomNumber(int High, int Low){
		LowNumber = Low;
		HighNumber = High;
	}
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
		int RandomNumber= getLowNumber() + (int) (Math.random()*(getHighNumber() - getLowNumber()+1));
		return RandomNumber;
	}
	public int RandomNum(){
		int RandomNumber= 1 + (int) (Math.random()*getHighNumber());
		return RandomNumber;
	}
}
