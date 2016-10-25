package test; //

// 2016년 10월 21일 금요일
public class Exam067 {

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
		score(new int[]{100,90,100}, "홍길동");
		score2("임꺽정", 100, 90, 80);
	}
}
