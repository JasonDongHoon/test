package test; // 반복문 for 응용3 (구구단)

// 2016년 10월 20일 목요일
public class Exam059 {

	public static void main(String[] args) {

		int a = 2, b = 1;
		for (a = 2; a < 10; a++) {
			for (b = 1; b < 10; b++) {
				System.out.printf("%d x %d = %d\n", a, b, a * b);
			}
			System.out.println();
		}

	}
}

/*
 * 
 */