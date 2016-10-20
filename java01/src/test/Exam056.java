package test; // 반복문 for에 여러 초기화 변수 선언하기

// 2016년 10월 20일 목요일
public class Exam056 {

	public static void main(String[] args) {
		String[] names = { "홍길동", "임꺽정", "유관순", "안중근", "윤봉길" };
		for (int i = 0, j = 10; i < names.length; i++)
			System.out.printf("%d:%s\n", i, names[i]);
	}
}

/*
 * 
 */