package Abstraction;

public class TestAbs {

	
	public static void main(String[] args) {
		MobileUser mu ;	//reference variable
		
		mu = new Rahim();
		mu.call();
		mu.sendMessage();
		
		mu = new Karim();
		mu.sendMessage();
	}
	}
