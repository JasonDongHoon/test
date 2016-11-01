package test; // 블록 변수 응용

// 2016년 10월 20일 목요일
public class Exam035 {
	static int a = 20;

	public static void main(String[] args) {
		int a = 100;
		m1(a); // ※ 메서드 실행 + ★리턴★ = 메서드 호출(method call)
		System.out.printf("m1-->%d\n", a);

		m1(a);
		System.out.printf("m1-->%d\n", a);

		m1(a);
		System.out.printf("m1-->%d\n", a);

	}

	static void m1(int a) {
		System.out.printf("m1-->%d\n", a);
		a = 300;
	}
}
