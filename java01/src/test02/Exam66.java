package test02; // int value와 String name으로 총점 구하기

// 2016년 10월 21일 금요일
public class Exam66 {

	static void score(int[] values, String name) {
		int sum = 0;
		for (int value : values) {
			sum += value;
		}
		System.out.printf("%s님의 총점은 %d입니다.\n", name, sum);
	}

	static void score2(String name, int... values) {
		int sum = 0;
		for (int value : values) {
			sum += value;
		}
		System.out.printf("%s님의 총점은 %d입니다.\n", name, sum);

	}

	public static void main(String[] args) {
		score(new int[] { 100, 90, 80 }, "사나");
		score2("채영", 100, 90, 80);
	}
}
