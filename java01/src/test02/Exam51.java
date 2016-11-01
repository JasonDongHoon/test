package test02; // while문 활용하여 구구단 만들기

public class Exam51 {

	public static void main(String[] args) {

		int a = 1, b = 0, c=2;
		while (a++ < 9) {
			System.out.println("   " + c++ + "단");
			while (b++ < 9) {
				System.out.println(a + " x " + b + " = " + a * b);
			}
			System.out.println();
			b = 0;
		}
	}
}