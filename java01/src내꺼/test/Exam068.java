package test; // call by value

// 2016년 10월 21일 금요일
public class Exam068 {

	static void square(int value) {
		value *= value;
		System.out.printf("square():%d\n", value);
	}
	public static void main(String[] args) {
		int value = 3;
		square(value);
		System.out.printf("main():%d\n", value);
	}
}

/* �ƱԸ�Ʈ
	-�޼��带 ȣ���� �� �Ѱ��ִ� ���̴�.
	ex) square(30) or square(value)
	�̶� 30�̳� value�� �ƱԸ�Ʈ�� �θ���.
	�Ķ����
	-�޼��尡 �ѱ� ���� �޴� ���� �����̴�.
	ex) void square(int value) {...}
	�̶� value ������ �Ķ�����̴�. */
	
