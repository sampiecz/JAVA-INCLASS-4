import java.lang.Thread;

public class Finder implements Runnable
{

	private int searchNum;
	private int beginNum;
	private int endNum;
    private Monitor myMonitor;

    public Finder(int searchNum,int beginNum,int endNum, Monitor myMonitor)
	{
		this.searchNum = searchNum;
		this.beginNum = beginNum;
		this.endNum = endNum;
		this.myMonitor = myMonitor;
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
					System.out.println("The number is " + i);
					System.out.println("Target number " + i + " found by " + this + ".");
                    this.myMonitor.foundNumber();
				}

				if(someCounter == 10)
				{
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
