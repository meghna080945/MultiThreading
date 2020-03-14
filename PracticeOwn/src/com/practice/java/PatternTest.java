package com.practice.java;

public class PatternTest {

	public static void main (String[] args) throws InterruptedException  
    { 
		Pattern ps = new Pattern();
		RevPatt rs = new RevPatt();
		Thread pattern1 = new Thread(ps);
		Thread pattern2 = new Thread(rs);
		
        pattern1.start();
        pattern2.start();
        
    }
}
