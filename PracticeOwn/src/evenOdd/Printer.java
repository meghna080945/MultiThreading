package evenOdd;

public class Printer {
	private volatile boolean isOdd;
	 
     void printEven(int number) {
    	 synchronized (this) {
    		 while(!isOdd) {
            try {
                wait();
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    	 
        
        System.out.println(Thread.currentThread().getName() + ":" + number);
        isOdd = false;
        notify();
     }
    }
 
     void printOdd(int number) {
    	synchronized (this) {
    		while(isOdd) {
            try {
                wait();
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    	
        System.out.println(Thread.currentThread().getName() + ":" + number);
        isOdd = true;
        notify();
    }
     }
}
