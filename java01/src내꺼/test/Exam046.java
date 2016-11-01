package test; // 블록 변수 응용

// 2016년 10월 20일 목요일
public class Exam046 {

	public static void main(String[] args) {
		int count = 0;
		int count2 = 0;
		while (count++ < 5) {
			while (count2++ < 3) {
				System.out.println("*****");
			}
			count2 = 0;
			System.out.println("--------------------------");
		}
	}
}
