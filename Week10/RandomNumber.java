
public class RandomNumber 
{
	public int RandomNumber(int high)
	{
		
		int RandomNumber= 1 + (int) (Math.random()*high);
		return RandomNumber;
	}
	public int RandomNumber()
	{
		
		int RandomNumber= 1 + (int) (Math.random()*10);
		return RandomNumber;
	}
}
