package test; // ★★★ 메서드 정의와 호출

// 2016년 10월 21일 금요일
public class Exam065 {
	// 1) 리턴값(x), 파라미터(x)
	static void greeting(String[] names) {
		System.out.println("hello, ");
		for (String name : names) {
			System.out.println(name + ",");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		greeting(new String[] { "홍길동", "임꺽정", "유관순" });

	}

}

/*
 *
 *
 *
 *
 */
