package test;

// 2016�� 10�� 20�� �����
public class Exam030 {

	public static void main(String[] args) {
		int a = 10;
		{
			int b = 20;

		}
		{
			int b = 300;
			System.out.println(b); // ���� ��Ͽ��� ����� ������ �̹� ���ŵǾ��� ������ �ٽ� ���� ����!!!
		}

	}
}