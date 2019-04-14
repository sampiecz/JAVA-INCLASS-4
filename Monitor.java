import java.lang.Thread;
import java.util.ArrayList;

public class Monitor extends Thread
{
	private ArrayList<Finder> threads = new ArrayList<Finder>();
	private boolean found = false;

	public void addThread(Finder theThread)
	{
		this.threads.add(theThread);
	}

	public synchronized void foundNumber()
	{
        for(Finder item : this.threads)
        {
            // stop the thread
            item.interrupt();
			this.found = true;
        }
	}

	public void run()
	{
		while(!this.found)
		{
		}
	}
}
