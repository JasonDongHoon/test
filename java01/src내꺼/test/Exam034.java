package test; // 블록 변수 응용

// 2016년 10월 20일 목요일
public class Exam034 {
	static int a = 20;

	public static void main(String[] args) {
		a = 100;
		m1();
	}

	static void m1() {
System.out.println(Exam033.a);
	}
}
