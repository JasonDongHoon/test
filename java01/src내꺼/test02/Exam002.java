package test02; // �ν��Ͻ��� ���۷���

// 2016�� 10�� 21�� �ݿ���
public class Exam002 {
	public static void main(String[] args) {

		String s1;
		s1 = new String("ȫ�浿");
		String s2 = s1;
		String s3 = s2;
		
		if (s1 == s2) {
			System.out.println(s1 == s3);
		}
		
		if (s1==s3) {
			System.out.println(s1 == s3);
		}
	}
}



/*
 * ���� 3���� ������ char �迭�� ����� �� �迭�� ���� �ڵ带 �����Ѵ�.
 * ���� length �޸𸮿� ���� ������ �����Ѵ�.
 * �׸��� �� �޸��� �ּҸ� �����Ѵ�. s1�� ���ڿ��� ����� �޸��� �ּҰ� ����ִ�.
 * �ּҸ� �˰� �;��? �� : �ڹٴ� �˷����� �ʴ´�.
 */
