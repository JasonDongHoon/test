package test;

// 2016년 10월 20일 목요일
public class Exam031 {
	static int a = 20;

	public static void main(String[] args) {
		a = 100;
		int b = 10;
	}

	static void mi() {
		a = 200;
		//b = 200; 컴파일 오류!! 다른 메서드 블록에 선언된 변수는 접근할 수 없다.
	}
}

/*
 * 클래스 블록에 선언된 변수
 * 
 */