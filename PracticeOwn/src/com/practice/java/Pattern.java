package com.practice.java;

class Pattern  implements Runnable
{ 
	
	

	public Pattern() {
	}

	static void printn(int num) 
	{ 
		 synchronized(System.out) {
			 if (num == 0)
			 {
			   	 System.out.notify();
				 return; 
			 }
	   	    System.out.print ("* "); 
	   	    printn(num - 1); 
	    }
		 	
	} 
	  
	static void  pattern(int n, int i) 
	{ 
	    if (n == 0) 
	        return; 
	    printn(i); 
	    System.out.println(); 
	    pattern(n - 1, i + 1); 
	} 
	  

@Override
public void run() {
	// TODO Auto-generated method stub
	 System.out.println("Producer is still Producing, Produced ");
	pattern(5,1);
} 
} 