package test; //

// 2016�� 10�� 21�� �ݿ���
public class Exam067 {

	static void score(int[] values, String name) {
		int sum = 0;
		for (int value : values) {
		sum += value;
		}
		System.out.printf("%s���� ������ %d�Դϴ�.\n", name, sum);

	}

static void score2(String name, int... values) {
	int sum = 0;
	for (int value : values) {
	sum += value;
	}
	System.out.printf("%s���� ������ %d�Դϴ�.\n", name, sum);

}
	public static void main(String[] args) {
		score(new int[]{100,90,100}, "ȫ�浿");
		score2("�Ӳ���", 100, 90, 80);
	}
}
