package test; // �ݺ��� for���� �ʱ�ȭ ����� �� �����ϱ�

// 2016�� 10�� 20�� �����
public class Exam055 {

	public static void main(String[] args) {
		int count = 0;
		for (; count < 3; count++) {
		System.out.printf("%d: ����������\n", count);
		System.out.println("----------------------------------------");
		
		count = 0;
		for (; count < 3;) {
			System.out.printf("%d: ����������\n", count);
			count++;
		}
		System.out.println("----------------------------------------");
		count = 0;
		for (;;) {
			if (count >= 3)
				break;
			System.out.printf("%d: ������\n", count);
			count++;
			
		}
	}
}
}

/*
 * 
 */