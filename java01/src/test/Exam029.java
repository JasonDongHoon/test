package test;

// 2016년 10월 20일 목요일
public class Exam029 {

	public static void main(String[] args) {
		int a = 10;
		{
			int b = 20;
			{
				int c = 30;
				System.out.printf("{{%d,%d,%d}}\n", a, b, c);
			}
//			System.out.printf("{{%d,%d,%d}}\n", a, b, c);
		}

	}
}