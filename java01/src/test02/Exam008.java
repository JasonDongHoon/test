package test02; // 배열

// 2016년 10월 24일 월요일
public class Exam008 {

	public static void main(String[] args) {

		int[] arr1 = new int[] { 10, 20, 30 };
		int[] arr2 = arr1;

		if (arr2 == arr1) {
			System.out.println("arr2==arr1");
		}

	}
}