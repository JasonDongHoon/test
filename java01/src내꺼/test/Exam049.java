package test;

public class Exam049 {

	public static void main(String[] args) {
		int a = 5;
		int b = 0;
		while (a > 0) {
			while (b < a) {
				System.out.print("*");
				b++;
			}
			System.out.println();
			a--;
			b = 0;
		}
		}
}

/*
 * �ڵ����� 1~5���� �ݺ��ϴ� while ���� �ۼ��϶�. �ݺ��� ������ ������ ���ڸ� ����϶�
 */