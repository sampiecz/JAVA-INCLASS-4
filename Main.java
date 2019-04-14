import java.lang.Thread;

public class Main
{

    public static void main(String args[])
    {

		int target = (int) (Math.random() * 1000);
		
        Monitor myMonitor = new Monitor();

		Thread threadZero = new Thread(new Finder(target, 0, 249, myMonitor));
        threadZero.setName("Thread-0");
		threadZero.run();

		Thread threadOne = new Thread(new Finder(target, 250, 499, myMonitor));
        threadOne.setName("Thread-1");
		threadOne.run(); 

		Thread threadTwo = new Thread(new Finder(target, 500, 749, myMonitor));
        threadTwo.setName("Thread-2");
		threadTwo.run(); 

		Thread threadThree = new Thread(new Finder(target, 750, 999, myMonitor));
        threadThree.setName("Thread-3");
		threadThree.run(); 

        myMonitor.addThread(threadZero);
        myMonitor.addThread(threadOne);
        myMonitor.addThread(threadTwo);
        myMonitor.addThread(threadThree);
    }

}

