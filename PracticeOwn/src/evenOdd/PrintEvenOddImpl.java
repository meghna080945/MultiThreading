package evenOdd;

public class PrintEvenOddImpl {
	boolean isEvenNumber;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer print = new Printer();
	    Thread t1 = new Thread(new EvenOdd(print, 100, false),"Odd");
	    Thread t2 = new Thread(new EvenOdd(print, 100, true),"Even");
	    t1.start();
	    t2.start();

}
}
