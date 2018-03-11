
class ThreadDemo implements Runnable {


	public void run(){
		System.out.println("Current thread id is : "+ Thread.currentThread().getId() + ". And running");
		for (int i = 0; i < 4; i++)
        {
            System.out.println(Thread.currentThread().getName()
                                                   + "  " + i);
            try
            {
                // thread to sleep for 1000 milliseconds
                Thread.sleep(1000);
            }
 
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
	}
	
}

public class ThreadTest{
	public static void main(String[] args) {
		int n = 10;
		for (int i = 0; i < n; i++){
			Thread td = new Thread(new ThreadDemo());
	// 	ThreadDemo td = new ThreadDemo();
		td.start();
		Thread t2 = new Thread(new ThreadDemo());
		 
        // call run() function
        t2.start();
		}
	}
}
