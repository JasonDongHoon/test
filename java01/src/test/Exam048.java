package test; // ��� ���� ����

// 2016�� 10�� 20�� �����
public class Exam048 {

	public static void main(String[] args) {
		int a = 5;
		int b = 0;
		while (a > 0) {
			while (b < a) {

				System.out.print("*");
				b++;
			}
			System.out.println();
			b = 0;
			a--;

		}
	}
}

/*
 * �ڵ����� 1~5���� �ݺ��ϴ� while ���� �ۼ��϶�. �ݺ��� ������ ������ ���ڸ� ����϶�
 */