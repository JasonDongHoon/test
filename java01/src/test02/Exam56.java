package test02; // String배열 + for문 활용하여 순위 나열하기

// 2016년 10월 20일 목요일
public class Exam56 {

	public static void main(String[] args) {
		String[] names = { "사나", "채영", "나연", "지효", "쯔위", "정연", "미나", "모모", "다현" };
		for (int i = 0; i < names.length; i++) {
			System.out.println(i+1 + "순위 : " + names[i]);
		}
	}
}