package test; // ��� ���� ����

// 2016�� 10�� 20�� �����
public class Exam045 {

	public static void main(String[] args) {
		int stopNo = Integer.parseInt(args[0]);

		int count = 0;
		while (true) {
			if (count > stopNo)
				break;
			System.out.printf("%d: ������\n", count++);

		}
	}
}
