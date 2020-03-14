package com.practice.java;

public class RevPatt implements Runnable {
	
	static void printPatternRowRecur(int n) {
		{

			if (n < 1)
				return;

			System.out.print("* ");
			printPatternRowRecur(n - 1);

		}
	}
	      
	    static void pattern(int n) 
	    { 
	        if (n < 1) 
	            return; 
	          
	        printPatternRowRecur(n);  
	        System.out.println (); 
	        pattern(n - 1); 
	          
	    }

		@Override
		public void run() {
			// TODO Auto-generated method stub
			synchronized (System.out) {
				try {
					System.out.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			pattern(5);
			}
			
		} 
	   
	
}
