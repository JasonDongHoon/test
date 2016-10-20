package test; // 블록 변수 응용

// 2016년 10월 20일 목요일
public class Exam045 {

	public static void main(String[] args) {
		int stopNo = Integer.parseInt(args[0]);

		int count = 0;
		while (true) {
			if (count > stopNo)
				break;
			System.out.printf("%d: 하하하\n", count++);

		}
	}
}
