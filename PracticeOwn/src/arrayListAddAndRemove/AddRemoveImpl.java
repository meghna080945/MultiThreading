package arrayListAddAndRemove;

public class AddRemoveImpl {
	public static void main(String[] args) throws InterruptedException {
		 AddRecord addRecord=new AddRecord();
	     RemoveRecord removeRecord=new RemoveRecord(addRecord);
	     
	     Thread addRecordThread=new Thread(addRecord,"addRecordThread");
	     Thread removeRecordThread=new Thread(removeRecord,"removeRecordThread");
	     removeRecordThread.start(); 
	     Thread.sleep(100); 
	     addRecordThread.start(); 
	}

}

