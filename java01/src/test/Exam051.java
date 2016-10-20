package test; // while로 구구단 만들자

public class Exam051 {

	public static void main(String[] args) {
		int a = 1, b = 0;
		while (a++ < 9) {
			while (b++ < 9) {

				System.out.printf(a + " * " + b + " = %d\n", a * b);
			}

			System.out.println();
			b = 0;
		}
	}
}

/*
 * 
 */