package test02; // �ν��Ͻ��� ���۷��� - new String(�ּ�)

// 2016�� 10�� 21�� �ݿ���
public class Exam003 {
	public static void main(String[] args) {

		String s1 = "ȫ�浿";
		String s2 = "ȫ�浿";
		String s3 = "ȫ�浿";
		
		if (s1 == s2) {
			System.out.println("s1 == s2");
		}
		
		if (s1 == s3) {new String("ȫ�浿");
			System.out.println("s1 == s3");
		}
	}
}



/*
 * ���� 3���� ������ char �迭�� ����� �� �迭�� ���� �ڵ带 �����Ѵ�.
 * ���� length �޸𸮿� ���� ������ �����Ѵ�.
 * �׸��� �� �޸��� �ּҸ� �����Ѵ�. s1�� ���ڿ��� ����� �޸��� �ּҰ� ����ִ�.
 * �ּҸ� �˰� �;��? �� : �ڹٴ� �˷����� �ʴ´�.
 */
