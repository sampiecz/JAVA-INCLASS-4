import java.lang.Thread;

public class Main
{

    public static void main(String args[])
    {

		int target = (int) (Math.random() * 1000);
		System.out.println("The number is " + target);
		
		Finder threadZero = new Finder(target, 0, 249);
		threadZero.run();
		Finder threadOne = new Finder(target, 250, 499);
		threadOne.run(); 
		Finder threadTwo = new Finder(target, 500, 749);
		threadTwo.run(); 

        Monitor myMonitor = new Monitor();
        myMonitor.addThread(threadZero);
        myMonitor.addThread(threadOne);
        myMonitor.addThread(threadTwo);
        myMonitor.run();
    }

}

