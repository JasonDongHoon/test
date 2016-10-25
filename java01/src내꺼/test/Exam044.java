package test; // 블록 변수 응용

// 2016년 10월 20일 목요일
public class Exam044 {

	public static void main(String[] args) {
		int count = 0;
		while (count < 10) {

			System.out.printf("%d: 하하하\n", count);
			count++;
		}
		System.out.println("----------------------------");
		
		count = 0;
		while (count < 10) {
			System.out.printf("%d: 하하하\n", count++);
		}
	}
}
