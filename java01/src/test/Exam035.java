package test; // ��� ���� ����

// 2016�� 10�� 20�� �����
public class Exam035 {
	static int a = 20;

	public static void main(String[] args) {
		int a = 100;
		m1(a); // �� �޼��� ���� + �ڸ��ϡ� = �޼��� ȣ��(method call)
		System.out.printf("m1-->%d\n", a);

		m1(a);
		System.out.printf("m1-->%d\n", a);

		m1(a);
		System.out.printf("m1-->%d\n", a);

	}

	static void m1(int a) {
		System.out.printf("m1-->%d\n", a);
		a = 300;
	}
}
