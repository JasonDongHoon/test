package test; // 반복문 for에서 초기화 선언부 등 생략하기

// 2016년 10월 20일 목요일
public class Exam055 {

	public static void main(String[] args) {
		int count = 0;
		for (; count < 3; count++) {
		System.out.printf("%d: 하하하하하\n", count);
		System.out.println("----------------------------------------");
		
		count = 0;
		for (; count < 3;) {
			System.out.printf("%d: 하하하하하\n", count);
			count++;
		}
		System.out.println("----------------------------------------");
		count = 0;
		for (;;) {
			if (count >= 3)
				break;
			System.out.printf("%d: 하하하\n", count);
			count++;
			
		}
	}
}
}

/*
 * 
 */