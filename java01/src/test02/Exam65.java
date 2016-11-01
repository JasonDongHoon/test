package test02; // ★★★ 메서드 정의와 호출

// 2016년 10월 21일 금요일
public class Exam65 {

	static void greeting(String[] names) {
		System.out.print("Hello, ");
		for (String name : names) {
			System.out.print(name + ", ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		greeting(new String[] { "사나", "채영", "나연" });
		greeting(new String[] { "사나" });
	}
}