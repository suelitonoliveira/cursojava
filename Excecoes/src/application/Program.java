package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		metod1();

		System.out.println("end of program");

	

	}
	public static void metod1() {
		System.out.println("method1 star");
		metod2();
		
		System.out.println("method1 end");
	}
	
	
	public static void metod2() {
		System.out.println("method2 star");
		
		Scanner sc = new Scanner(System.in);

		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position");
			e.printStackTrace();
			sc.next();
		} catch (InputMismatchException e) {
			System.out.println("input error");
		}
		
		System.out.println("method2 end");
		sc.close();
		
	}

}
