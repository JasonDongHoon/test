package test; // 반복문 for 응용2

// 2016년 10월 20일 목요일
public class Exam058 {

	public static void main(String[] args) {
		
		for (String value : args)
			System.out.printf("%s\n", value);
	}
}

/*
 * for (변수선언 : 배열 or Collection 객체)
 * -변수선언 : 배열에서 꺼낸 값을 저장할 변수이다.
 * -배열 전체를 반복하고 싶을 때 쓴다.
 * -인덱스를 알 필요가 없을때 사용한다.
 */