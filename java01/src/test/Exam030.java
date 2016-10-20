package test;

// 2016년 10월 20일 목요일
public class Exam030 {

	public static void main(String[] args) {
		int a = 10;
		{
			int b = 20;

		}
		{
			int b = 300;
			System.out.println(b); // 이전 블록에서 선언된 변수는 이미 제거되었기 때문에 다시 선언 가능!!!
		}

	}
}