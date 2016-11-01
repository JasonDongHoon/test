package test; // for로 구구단 만들자

public class Exam050 {

	public static void main(String[] args) {
		int i = 2, j = 1;
		for (i=2; i<10; i++) {
			for (j=1; j<10; j++) {

				System.out.printf("%d * %d = %d\n", i, j, i*j);
			}

		}

		}
}

/*
 * 코딩순서 1~5까지 반복하는 while 문을 작성하라. 반복할 때마다 현재의 숫자를 출력하라
 */