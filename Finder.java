import java.lang.Thread;

public class Finder implements Runnable
{

	private int searchNum;
	private int beginNum;
	private int endNum;

    public Finder(int searchNum,int beginNum,int endNum)
	{
		this.searchNum = searchNum;
		this.beginNum = beginNum;
		this.endNum = endNum;
	}

	public void run()
	{
		
		int someCounter = 0;

		try
		{
			for(int i = beginNum; i < endNum; i++)
			{

				if(i == searchNum)
				{
					System.out.println("Found num, it is: " + i);
                    // Notify Monitor thread
                    // This should interrupt all finder threads
                    // WHen the thread is interrupted it
                    // Should display a line saying it has ended. 
				}

				if(someCounter == 10)
				{
					System.out.println("Sleeping.");
					Thread.sleep(1);
					someCounter = 0;
				}

				someCounter++;
			}
		}
		catch (InterruptedException e) 
		{
			System.out.println("Execption : " + e + " has occured.");
		}
	}

}
