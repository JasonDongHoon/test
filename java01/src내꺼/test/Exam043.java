package test; // ��� ���� ����

// 2016�� 10�� 20�� �����
public class Exam043 {

	public static void main(String[] args) {
		// byte value = 10; ����
		// short value = 10; ����
		// int value = 10; ����
		// long value = 10; ����
		// float value = 10; ����
		// double value = 10; ����
		// boolean value = 10; ����
		// char value = '��'; ����
//		String value = "�մ�";
		switch (args[0]) {
		case "�մ�":
			System.out.println("��ȸ�� �����մϴ�.");
			break;
		case "ȸ��":
			System.out.println("��ȸ,����,���� �����մϴ�.");
			break;
		case "������":
			System.out.println("ȸ�� ��� �����մϴ�.");
			break;
		default:
			System.out.println("��ȿ���� ���� �����Դϴ�.");
			break;
		}

	}
}
