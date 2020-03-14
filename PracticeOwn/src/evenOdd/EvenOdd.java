package evenOdd;

public class EvenOdd implements Runnable{
	
	    private int max;
	    private Printer print;
	    private boolean isEvenNumber;

	    
	 
	    @Override
	    public void run() {
	        int number = isEvenNumber ? 2 : 1;
	        while (number <= max) {
	            if (isEvenNumber) {
	                print.printEven(number);
	                
	            } else {
	                print.printOdd(number);
	            }
	            number += 2;
	        }
	        
	    }

		

		public EvenOdd(Printer print, int max, boolean isEvenNumber) {
			// TODO Auto-generated constructor stub
			super();
			this.max = max;
			this.print = print;
			this.isEvenNumber = isEvenNumber;
		}

		
	}

