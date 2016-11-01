package test;

// 2016년 10월 20일 목요일
public class Exam032 {
	static int a = 20;

	public static void main(String[] args) {
		int a = 200; // 클래스 블록에 선언된 변수와 구분해서 같은 이름으로 메서드 안에 변수를 선언할 수 있다.
		System.out.println(a); // 가장 가까운 블록의 변수이다.
		
		System.out.println(Exam031.a);
	}

	static void mi() {
		int a = 300;
	}
}

/*
 * 클래스 블록에 선언된 변수
 * 
 */