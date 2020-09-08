package IfStatement;

public class two_integers {

	public static void main(String[] args) {
		int x = 20;
		int y = 10;
		int z = x - y;
		
		if (x > y) {
			System.out.println("X is greater than Y");
		}
		else if (y > x) {
			System.out.println("Y is greater than X");
		}
		
		if (z <= 5) {
			System.out.println("Less than 5");
		}
		else {
			System.out.println("Greater than 5");
		}
	}

}
