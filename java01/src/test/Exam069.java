package test; // call by reference

// 2016년 10월 21일 금요일
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
