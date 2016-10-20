package test;

public class Exam049 {

	public static void main(String[] args) {
		int a = 5;
		int b = 0;
		while (a > 0) {
			while (b < a) {
				System.out.print("*");
				b++;
			}
			System.out.println();
			a--;
			b = 0;
		}
		}
}

/*
 * 코딩순서 1~5까지 반복하는 while 문을 작성하라. 반복할 때마다 현재의 숫자를 출력하라
 */