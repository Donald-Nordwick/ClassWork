
public class RandomNumber 
{
	public int GetANumber_Between_1_and_10(int high)
	{
		
		int GetANumber_Between_1_and_10= 1 + (int) (Math.random()*high);
		return GetANumber_Between_1_and_10;
	}
}
