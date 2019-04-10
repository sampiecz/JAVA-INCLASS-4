import java.lang.Thread;

public class Main
{

    public static void main(String args[])
    {

		int target = (int) (Math.random() * 1000);
		System.out.println("The number is " + target);
		
		FindItThread threadZero = new FindItThread(target, 0, 249);
		threadZero.setName("Thread-0");
		threadZero.run();

		FindItThread threadOne = new FindItThread(target, 250, 499);
		threadOne.setName("Thread-1");
		threadOne.run(); 

		FindItThread threadTwo = new FindItThread(target, 500, 749);
		threadTwo.setName("Thread-2");
		threadTwo.run(); 

    }

}

