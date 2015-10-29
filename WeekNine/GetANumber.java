
public class GetANumber 
{
	public int GetANumber_Between_1_and_10(int high)
	{
		
		int GetANumber_Between_1_and_10= 1 + (int) (Math.random()*high);
		return GetANumber_Between_1_and_10;
	}
	public int GetANumber_Between_1_and_10()
	{
		
		int GetANumber_Between_1_and_10= 1 + (int) (Math.random()*10);
		return GetANumber_Between_1_and_10;
	}
}
