package deadlockOps;

public class ReadUser implements Runnable{
	public void run() {
		synchronized (ReadUser.class) {
			synchronized (UpdateUser.class) {
			
		}
		
	}

	}
}
