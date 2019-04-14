import java.lang.Thread;
import java.util.ArrayList;

public class Monitor extends Thread 
{
	private ArrayList<Thread> myThreads = new ArrayList<Thread>();
	private boolean found = false;

	public void addThread(Thread theThread)
	{
		myThreads.add(theThread);
	}

	public synchronized void foundNumber()
	{
        for(Thread item : myThreads)
        {
            // stop the thread
            System.out.println(item + " interrupted");
            item.currentThread().interrupt();
			found = true;
        }
	}

	public void run()
	{
		while(!found)
		{
		}
	}
}
