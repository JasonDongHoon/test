package test02; // 인스턴스와 레퍼런스 - 인스턴스 생성 위치

// 2016년 10월 24일 월요일
public class Exam010 {

	static int[] m1() {
		return m2();

	}

	static int[] m2() {
		return m3();

	}

	static int[] m3() {
		return new int[] { 10, 20, 30 };

	}

	public static void main(String[] args) {

		int[] arr1 = { 10, 20, 30 };
		int[] arr2 = { 10, 20, 30 };

		if (arr2 == arr1) {
			System.out.println("arr2==arr1");
		}

	}
}