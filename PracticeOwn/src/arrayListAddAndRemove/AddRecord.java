package arrayListAddAndRemove;

import java.util.LinkedList;
import java.util.List;

public class AddRecord implements Runnable{

	 List<Employee> sharedQueue;
	    
	 AddRecord(){
	           sharedQueue=new LinkedList<Employee>();
	    }
	    
	    @Override
	    public void run(){
	           
	           synchronized (this) {
	                   
	                        sharedQueue.add(new Employee("Meghna", 25, 10000, "Bangalore"));
	                        sharedQueue.add(new Employee("shus", 23, 20000, "Jammu"));
	                        sharedQueue.add(new Employee("shiv", 25, 30000, "Gaya"));
	                        sharedQueue.add(new Employee("Misty", 20, 70000, "Patna"));
	                        System.out.println("records is still adding, added  ");
	                        
	                        try{
	                               Thread.sleep(1000);
	                        }catch(InterruptedException e){e.printStackTrace();}
	                  
	                  
	                  System.out.println("Records are added, records can be consume.");
	                 
	                  this.notify();    
	           }
	    }
}
