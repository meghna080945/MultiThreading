package deadlockOps;

public class deadLockMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ReadUser read = new ReadUser();
UpdateUser update = new UpdateUser();
Thread th1 = new Thread(read);

Thread th2 = new Thread(update);
th1.start();
th2.start();


	}

}
