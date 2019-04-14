import java.lang.Thread;

public class Main
{

    public static void main(String args[])
    {

		int target = (int) (Math.random() * 1000);
		System.out.println("The number is " + target);
		
        Monitor myMonitor = new Monitor();

		Finder threadZero = new Finder(target, 0, 249, myMonitor);
        threadZero.setName("Thread-0");
		threadZero.run();

		Finder threadOne = new Finder(target, 250, 499, myMonitor);
        threadOne.setName("Thread-1");
		threadOne.run(); 

		Finder threadTwo = new Finder(target, 500, 749, myMonitor);
        threadTwo.setName("Thread-2");
		threadTwo.run(); 

		Finder threadThree = new Finder(target, 750, 999, myMonitor);
        threadThree.setName("Thread-3");
		threadThree.run(); 

        myMonitor.addThread(threadZero);
        myMonitor.addThread(threadOne);
        myMonitor.addThread(threadTwo);
        myMonitor.addThread(threadThree);
    }

}

