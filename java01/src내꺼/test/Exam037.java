package test; // ��� ���� ����

// 2016�� 10�� 20�� �����
public class Exam037 {

	public static void main(String[] args) {
		int age = Integer.parseInt(args[0]);
		// int age = 15;

		if (age < 19) {
			System.out.println("û�ҳ��Դϴ�.");
			System.out.println("������ �Ϲ� ī�带 ����ϼž� �մϴ�.");
		}
		if (age >= 19) {
			System.out.println("�����Դϴ�.");
			System.out.println("û�ҳ� ī�带 ����� �� �����ϴ�.");
		}
	}
}
