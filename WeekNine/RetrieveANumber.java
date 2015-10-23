
public class RetrieveANumber 
{
	public int GetANumber(int low,int high)
	{
		
		int GetANumber_Between_1_and_10= low + (int) (Math.random()*high);
		return GetANumber_Between_1_and_10;
	}
}
