package test;

// 2016�� 10�� 20�� �����
public class Exam031 {
	static int a = 20;

	public static void main(String[] args) {
		a = 100;
		int b = 10;
	}

	static void mi() {
		a = 200;
		//b = 200; ������ ����!! �ٸ� �޼��� ��Ͽ� ����� ������ ������ �� ����.
	}
}

/*
 * Ŭ���� ��Ͽ� ����� ����
 * 
 */