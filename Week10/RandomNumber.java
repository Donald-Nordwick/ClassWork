
public class RandomNumber 
{
	public int RandomNumber(int num)
	{
		
		int RandomNumber= 1 + (int) (Math.random()*num);
		return RandomNumber;
	}
	public int RandomNumber(int high, int low)
	{
		
		int RandomNumber= low + (int) (Math.random()*high);
		return RandomNumber;
	}
	public int RandomNumber()
	{
		
		int RandomNumber= 1 + (int) (Math.random()*10);
		return RandomNumber;
	}
}
