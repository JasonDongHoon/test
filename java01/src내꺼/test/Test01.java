package test;

public class Test01 {
	public static void main(String[] args) {

		/* for문으로 * 1,2,3,4,5 찍기
		 * int i = 0, j = 0; for (i = 0; i < 5; i++) { for (j = 0; j < 5 - i; j++) {
		 * System.out.printf("*"); }
		 * 
		 * System.out.println(); }
		 */

		int a = 0, b = 0;

		while (a < 5) {
			while (b < 5 - a) {

				System.out.printf("*");
				b++;
			}
			System.out.println();
			b = 0;
			a++;
		}
	}
}
