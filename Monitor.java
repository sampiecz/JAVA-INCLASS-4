import java.lang.Thread;
import java.util.ArrayList;

public class Monitor extends Thread
{
	private ArrayList<Thread> threads = new ArrayList<Thread>();

	public void addThread(Thread theThread)
	{
		this.threads.add(theThread);
	}

	public void foundNumber()
	{
        for(item in this.threads)
        {
            // stop the thread
            item.stop();

			item.isInterrupted();
            // should also set a bolean instance variable to true 
            // to indicate that the number has been found
            //
            // WHAT BOOLEAN INSTANCE VALUE
        }
	}

	public void run()
	{
		while(!this.threads.isEmpty())
		{
            this.thread
		}
	}
}
