package test; // call by reference

// 2016�� 10�� 21�� �ݿ���
public class Exam069 {

	static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		System.out.printf("swap():%d, %d\n", a, b);
	}

	public static void main(String[] args) {
		int a = 10, b = 20;
		swap(a, b);
		System.out.printf("main():%d, %d\n", a, b);
	}
}
