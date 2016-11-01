package test02; // for문 활용하여 구구단 만들기

public class Exam50 {

	public static void main(String[] args) {

		int a = 2, b = 1, c = 2;
		for (a = 2; a < 10; a++) {
			System.out.println("   " + c++ + "단");
			for (b = 1; b < 10; b++) {
				System.out.println(a + " x " + b + " = " + a * b);
			}
			System.out.println();
		}
	}
}