public class Aladdin extends Movie 
{

	@Override
	public void cost()
		{
		cost = "12 Dollars";
		System.out.println(cost + " is the price.");
		}
	
	@Override
	public void numberOfpeople()
		{
		numberOfpeople = "35";
		System.out.println(numberOfpeople + " people are attending.");
		
		}
	}