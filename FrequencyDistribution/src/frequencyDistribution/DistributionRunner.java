package frequencyDistribution;

public class DistributionRunner 
{
	public static void main(String[] args)
	{
		//Instance variables
		int[] numOfPercents = new int[5];		//Array to hold the percent occurrence of numbers 1 - 5
		int temp;								//Temporary variable to hold randomly generated number
		
		//Generate 1 - 5 100 times to find percent frequency
		for(int i = 0; i < 100; i++)
		{
			temp = FrequencyDistribution.calculateNumber();
			numOfPercents[temp - 1]++;
		}
		
		//Print output
		for(int i = 0; i < numOfPercents.length; i++)
		{
			System.out.println("Percent frequency of the number " + (i + 1) + " is: " + numOfPercents[i] + "%");
		}
	}
}
