package test02; // 

// 2016년 10월 24일 월요일
public class Exam005 {

	static void m1(String p1) {
		String s = "홍길동";
		if (p1 == s) {
			System.out.println("p1 == s");
		}
	}

	public static void main(String[] args) {
		String s1 = "홍길동";
		m1(s1);

	}
}