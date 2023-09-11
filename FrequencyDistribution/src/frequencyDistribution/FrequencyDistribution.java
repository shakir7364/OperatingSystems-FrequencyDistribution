package frequencyDistribution;

public final class FrequencyDistribution 
{
	//Initialize variables
	private static int percent;
	
	//Generate and return random number between 1 - 5
	public static int calculateNumber()
	{
		percent = (int)(Math.random() * 100) + 1;
		if(percent <= 5)
			return 1;
		else if(percent > 5 && percent <= 15)
			return 2;
		else if(percent > 15 && percent <= 30)
			return 3;
		else if(percent > 30 && percent <= 50)
			return 4;
		else
			return 5;
	}
}
