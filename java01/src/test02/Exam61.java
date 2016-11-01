package test02; // ★★★

// 2016년 10월 21일 금요일
public class Exam61 {
	// 1) 리턴값(x), 파라미터(x)
	static void m1() {}

	// 2) 리턴값(x), 파라미터(o)
	static void m2(int a, String b, float[] f) {}

	// 3) 리턴값(o), 파라미터(x)
	static int m3() {return 100;}

	// 4) 리턴값(o), 파라미터(o)
	static int m4(int a, float b) {return (int) (a * b);}

	public static void main(String[] args) {
		
	}

}

/*
 * 리턴타입 ex) void(결과없음), int, long, String, int[], Strint[]... 메서드명 : 메서드를 실행할 때
 * 사용할 이름 ex) 메서드명(); int value = 메서드명(); 파라미터 선언 : 메서드를 호출할 때 넘겨준 값을 받는 변수 ex)
 * 메서드명(inta, int b, String[] args
 */
