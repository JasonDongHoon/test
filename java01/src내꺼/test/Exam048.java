package test; // 블록 변수 응용

// 2016년 10월 20일 목요일
public class Exam048 {

	public static void main(String[] args) {
		int a = 5;
		int b = 0;
		while (a > 0) {
			while (b < a) {

				System.out.print("*");
				b++;
			}
			System.out.println();
			b = 0;
			a--;

		}
	}
}

/*
 * 코딩순서 1~5까지 반복하는 while 문을 작성하라. 반복할 때마다 현재의 숫자를 출력하라
 */