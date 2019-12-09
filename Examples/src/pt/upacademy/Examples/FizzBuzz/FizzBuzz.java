package pt.upacademy.Examples.FizzBuzz;

import java.util.Scanner;

public class FizzBuzz {
	private Scanner sc = new Scanner(System.in);
	private int numCicle;

	public static void main(String[] args) {
		System.out.println("FizzBuzz Class");
		FizzBuzz myFizz = new FizzBuzz();
		
		System.out.println(myFizz);

		System.out.println("myFizz.numCicle : " + myFizz.numCicle);
		System.out.println("myFizz.getNumCicle() : " + myFizz.getNumCicle());

		myFizz.setNumCicle();
		myFizz.resolve();
	}

	public int getNumCicle() {
		return numCicle;
	}

	public void setNumCicle() {
		int value = 0;
		do {
			System.out.println("Valor entre 1 e 100");
			if (sc.hasNextInt()) {
				value = sc.nextInt();
			} else {
				sc.nextLine();
			}
			if (value > 100 || value < 1) {
				value = 0;
				System.out.println("O valor tem de ser entre 1 e 100");
			}
		} while (value < 1);
		this.numCicle = value;
	}

	public void resolve() {
		String output = "1";
		for (int i = 2; i <= this.numCicle; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				output += ", Big3and5";
			} else if (i % 3 == 0) {
				output += ", Big3";
			} else if (i % 5 == 0) {
				output += ", Big5";
			} else {
				output += ", " + i;
			}
		}
		System.out.println(output);
	}

	@Override
	public String toString() {
		return "My Fizz numCicle=" + numCicle;
	}
	
	

}
