package deadlockOps;

public class UpdateUser implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (UpdateUser.class) {
			synchronized (ReadUser.class) {
			
		}
		
		
	}

	}
}
