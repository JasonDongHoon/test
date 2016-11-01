package test; // call by reference

// 2016년 10월 21일 금요일
public class Exam070 {

	static void swap(int[] values) {
		int temp = values[0];
		values[0] = values[1];
		values[1] = temp;

	}

		public static void main(String[] args) {
		int [] values = {10, 20};
		System.out.printf("main():%d, %d\n", values[0], values[1]);
		swap(values);
		System.out.printf("main():%d, %d\n", values[0], values[1]);
	}
}
