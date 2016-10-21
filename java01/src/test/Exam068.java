package test; // call by value

// 2016년 10월 21일 금요일
public class Exam068 {

	static void square(int value) {
		value *= value;
		System.out.printf("square():%d\n", value);
	}
	public static void main(String[] args) {
		int value = 3;
		square(value);
		System.out.printf("main():%d\n", value);
	}
}

/* 아규먼트
	-메서드를 호출할 때 넘겨주는 값이다.
	ex) square(30) or square(value)
	이때 30이나 value를 아규먼트라 부른다.
	파라미터
	-메서드가 넘긴 값을 받는 로컬 변수이다.
	ex) void square(int value) {...}
	이때 value 변수가 파라미터이다. */
	
