package test; // ��� ���� ����

// 2016�� 10�� 20�� �����
public class Exam044 {

	public static void main(String[] args) {
		int count = 0;
		while (count < 10) {

			System.out.printf("%d: ������\n", count);
			count++;
		}
		System.out.println("----------------------------");
		
		count = 0;
		while (count < 10) {
			System.out.printf("%d: ������\n", count++);
		}
	}
}
