package arrayListAddAndRemove;

public class RemoveRecord implements Runnable{
	 AddRecord addRecord;
	    
	 RemoveRecord(AddRecord obj){
		 addRecord=obj;
	    }
	    
	    public void run(){
	           synchronized (this.addRecord) {
	                  
	                  System.out.println("record removing waiting for addition to get over.");
	                     try{
	                         this.addRecord.wait();
	                        }catch(InterruptedException e){e.printStackTrace();}
	                  
	           }
	           
	           int productSize=this.addRecord.sharedQueue.size();
	           for(int i=0;i<productSize;i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	                  System.out.println("removed : "+ this.addRecord.sharedQueue.remove(0) +" ");  
	           }
	    }
}
