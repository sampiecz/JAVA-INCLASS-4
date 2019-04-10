import java.lang.Thread;

public class FindItThread extends Thread 
{

	private int searchNum;
	private int beginNum;
	private int endNum;

    public FindItThread(int searchNum,int beginNum,int endNum)
	{
		this.searchNum = searchNum;
		this.beginNum = beginNum;
		this.endNum = endNum;
	}

	public void run()
	{
		for(int i = beginNum; i < endNum; i++)
		{
			if(i == searchNum)
			{
				System.out.println("Found num, it is: " + i);
			}
		}
	}

}
